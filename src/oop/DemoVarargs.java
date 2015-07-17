package oop;

/**
 * Created by green on 18.07.2015.
 *
 * ����������� ���������� ���������� ������
 *
 * ������� � ������ Java 5, ��������� ����������� �������� � ����� �������-
 ��������� ����� ����������,
 */
public class DemoVarargs {

    public static int defineArgCount(Integer... args) {
        if (args.length == 0) {
            System.out.print("No arg ");
        } else {
            for (int element : args) {
                System.out.printf("arg:%d ", element);
            }
        }
        return args.length;
    }
    public static void main(String... args) {
        System.out.println("N=" + defineArgCount(7, 71, 555));
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("N=" + defineArgCount(arr));
        System.out.println(defineArgCount());
// defineArgCount(arr, arr); // ������ ����������
// defineArgCount(71, arr); // ������ ����������
    }
}