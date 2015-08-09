package collection.set;

import java.util.EnumSet;

/**
 * Created by green on 09.08.2015.
 *
 *
 * иcпользование множества enum-типов
 *
 *
 * Абстрактный класс EnumSet<E extends Enum<E>> наследуется от аб-
 страктного класса AbstractSet.
 java.util.AbstractCollection<E>
 java.util.AbstractSet<E>
 java.util.EnumSet<E>
 Класс специально реализован для работы с типами enum. Все элементы та-
 кой коллекции должны принадлежать единственному типу enum, определенно-
 му явно или неявно. Внутренне множество представимо в виде вектора битов,
 обычно единственного long. Множества нумераторов поддерживают перебор
 по диапазону из нумераторов. Скорость выполнения операций над таким множе-
 */
public class UseEnumSet {
    public static void main(String[ ] args) {
/* мн ожество japanAuto содержит элементы типа
enum из интервала, определенного двумя элементами */
        EnumSet<CarManufacturer> japanAuto =
                EnumSet.range(CarManufacturer.TOYOTA, CarManufacturer.SUZUKI);
/* множество other будет содержать все элементы, не содержащиеся в множестве japanAuto */
        EnumSet <CarManufacturer> other = EnumSet.complementOf(japanAuto);
        System.out.println(japanAuto);
        System.out.println(other);
        action("audi", japanAuto);
        action("suzuki", japanAuto);
    }
    public static boolean action(String auto, EnumSet <CarManufacturer> set) {
        CarManufacturer cm = CarManufacturer.valueOf(auto.toUpperCase());
        boolean ok = false;
        if(ok = set.contains(cm)) {
// обработка
            System.out.println("Обработан: " + cm);
        } else {
            System.out.println("Обработка невозможна: " + cm);
        }
        return ok;
    }
}
