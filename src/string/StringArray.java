package string;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 */
public class StringArray {
    public static void main(String[ ] args) {
        String names = " Alena Alice alina albina Anastasya ALLA ArinA ";
        names = names.trim(); // удаление пробелов по краям строки
// разбиение строки на подстроки, где "пробел" — разделитель
        String a[ ] = names.split(" "); // массив содержит элементы нулевой длины
        for(int j = 0; j < a.length - 1; j++) {
            for(int i = j + 1; i < a.length; i++) {
                if(a[i].compareToIgnoreCase(a[j]) < 0) { //Метод compareToIgnoreCase() выполняет лексикографическое
                    String temp = a[j];                 //  сравнение строк между собой по правилам Unicode.
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        for (String arg : a) {
            if (!arg.isEmpty()) { //Оператор if(!arg.isEmpty()) не позволяет выводить пустые строки.
                System.out.print(arg + " ");
            }
        }
    }
}
