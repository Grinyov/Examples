package collection.comparator;

import collection.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by green on 31.07.2015.
 *
 * сортировка списка по полю, определенному в классе comparator-е
 *
 * Метод compare() автоматически вызывается при сортировке списка мето-
 дом: static <T> void sort(List<T> list, Comparator<? super T> c) класса Collections,
 в качестве первого параметра принимающий коллекцию, в качестве второго —
 объект-comparator, из которого извлекается и применяется правило сортировки.
 С помощью анонимного типа можно привести простейшую реализацию ком-
 паратора.

 */
public class SortItemRunner {
    public static void main(String[ ] args) {
        ArrayList<Item> p = new ArrayList<Item>() {
            {
                add(new Item(52201, 9.75f, "T-Shirt"));
                add(new Item(52127, 13.99f, "Dress"));
                add(new Item(47063, 45.95f, "Jeans"));
                add(new Item(90428, 60.9f, "Gloves"));
                add(new Item(53295, 31f, "Shirt"));
                add(new Item(63220, 14.9f, "Tie"));
            }
        };
// создание компаратора
        Comparator<Item> comp = new Comparator<Item>() {
            // сравнение для сортировки по убыванию цены товара
            public int compare(Item one, Item two) {
                return Double.compare(two.getPrice(), one.getPrice());
            }
// public boolean equals(Object ob) { /* реализация */ }
        };
// сортировка списка объектов
        Collections.sort(p, comp);
        System.out.println(p);
    }
}
