package thread.concurrent.countdownlatch;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.Random;
/**
 * Created by green on 30.08.2015.
 *
 * поток-студент, выполняющий задания и ожидающий их проверки
 *
 * Демонстрацией возможностей класса CountDownLatch может служить за-
 дача выполнения студентами набора заданий (тестов). Студенту предлагается
 для выполнения набор заданий. Он выполняет их и переходит в режим ожида-
 ния оценок по всем заданиям, чтобы вычислить среднее значение оценки.
 Преподаватель (Tutor) проверяет задание и после каждого проверенного зада-
 ния сдвигает «щеколду» на единицу. Когда все задания студента проверены,
 счетчик становится равным нулю и барьер снимается, производятся необходи-
 мые вычисления в классе Student.
 */
public class Student extends Thread {
    private Integer idStudent;
    private List<Task> taskList;
    private CountDownLatch countDown;
    public Student(Integer idStudent, int numberTasks) {
        this.idStudent = idStudent;
        this.countDown = new CountDownLatch(numberTasks);
        this.taskList = new ArrayList<Task>(numberTasks);
    }
    public Integer getIdStudent() {
        return idStudent;
    }
    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }
    public CountDownLatch getCountDownLatch() {
        return countDown;
    }
    public List<Task> getTaskList() {
        return taskList;
    }
    public void addTask(Task task) {
        taskList.add(task);
    }
    public void run() {
        int i = 0;
        for (Task inWork : taskList) {
// на выполнение задания требуется некоторое время
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
// отправка ответа
            inWork.setAnswer("Answer #" + ++i);
            System.out.println("Answer #" + i + " from " + idStudent);
        }
        try {
            countDown.await(); // ожидание проверки заданий
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
// подсчет средней оценки за все задачи
        float averageMark = 0;
        for (Task inWork : taskList) {
// выполнение задания
            averageMark += inWork.getMark(); // отправка ответа
        }
        averageMark /= taskList.size();
        System.out.println("Student " + idStudent + ": Average mark = "
                + averageMark);
    }
}
