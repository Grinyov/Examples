package collection.set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by green on 09.08.2015.
 *
 * использование множества для вывода всех уникальных слов из файла
 *
 *
 * Ключ (хэш-код) используется в качестве индекса хэш-таблицы для доступа
 к объектам множества, что значительно ускоряет процессы поиска, добавления
 и извлечения элемента. Скорость указанных процессов становится заметной
 для коллекций с большим количеством элементов. Множество HashSet не яв-
 ляется сортированным. В таком множестве могут храниться элементы с одина-
 ковыми хэш-кодами в случае, если эти элементы не эквивалентны при сравне-
 нии. Для грамотной организации HashSet следует следить, чтобы реализации
 методов hashCode() и equals() соответствовали контракту.
 */
public class DemoHashSet {
    public static void main(String[ ] args) {
        HashSet<String> words = new HashSet<>(100);
        long callTime = System.nanoTime();
        Scanner scan = null;
        try {
            scan = new Scanner(new File("d://DOCS//stihi.txt"));
            scan.useDelimiter("[^А-я]+");
            while (scan.hasNext()) {
                String word = scan.next();
                words.add(word.toLowerCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Iterator<String> it = words.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        TreeSet<String> ts = new TreeSet<>(words);
        System.out.println(ts);
        long totalTime = System.nanoTime() - callTime;
        System.out.println("различных слов: " + words.size() + ", "
                + totalTime + " наносекунд");
    }
}
