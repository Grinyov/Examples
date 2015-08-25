package thread.priority;

/**
 * Created by Grinyov Vitaliy on 25.08.15.
 *
 *
 * Поток с более высоким приоритетом в данном случае, как правило, монопо-
 лизирует вывод на консоль.
 Потоки объединяются в группы потоков. После создания потока нельзя из-
 менить его принадлежность к группе.
 ThreadGroup tg = new ThreadGroup("Группа потоков 1");
 Thread t0 = new Thread(tg, "поток 0");
 Все потоки, объединенные в группу, имеют одинаковый приоритет. Чтобы опре-
 делить, к какой группе относится поток, следует вызвать метод getThreadGroup().
 Если поток до включения в группу имел приоритет выше приоритета группы
 потоков, то после включения значение его приоритета станет равным приори-
 тету группы. Поток же со значением приоритета, более низким, чем приоритет
 группы после включения в оную, значения своего приоритета не изменит.
 */
public class PriorityRunner {
    public static void main(String[ ] args) {
        PriorThread min = new PriorThread("Min");
        PriorThread max = new PriorThread("Max");
        PriorThread norm = new PriorThread("Norm");
        min.setPriority(Thread.MIN_PRIORITY); // 1
        max.setPriority(Thread.MAX_PRIORITY); // 10
        norm.setPriority(Thread.NORM_PRIORITY); // 5
        min.start();
        norm.start();
        max.start();
    }
}
