package io;

import java.io.*;

/**
<<<<<<< Updated upstream
 * Created by Grinyov Vitaliy on 31.07.15.
 *
 * буферизованный вывод в файл
 *
 *
 * Для наиболее удобного вывода информации в файл (или в любой другой
 поток) следует организовать следующую последовательность инициализации
 потоков с помощью класса PrintWriter:
 new PrintWriter(new BufferedWriter(new FileWriter(new File("text\\data.txt"))));
 В итоге класс PrintWriter выступает классом-оберткой для класса BufferedWriter,
 и далее так же, как и класс BufferedReader для FileReader. По окончании работы
 с потоками закрывать следует только самый последний класс. В данном случае —
 PrintWriter. Все остальные, в него обернутые, будут закрыты автоматически.
 Приведенный ниже пример демонстрирует вывод в файл строк и чисел
 с плавающей точкой.
 *
 */

public class DemoWriter {
    public static void main(String[] args) throws IOException {

        File f = new File("data\\res.txt");
        double[ ] v = { 1.10, 1.2, 1.401, 5.01, 6.017, 7, 8 };
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            for (double version : v) {
                pw.printf("Java %.2g%n", version);// запись прямо в файл
            }
        } catch (IOException e) {
            System.err.println("ошибка открытия потока " + e);
        } finally {
            if (pw != null) {
                // закрывать нужно только внешний поток
                pw.close();
            }
        }
    }
}
