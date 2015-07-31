package collection.comparator;

/**
 * Created by green on 01.08.2015.
 *
 * Перечисление, предоставляющее возможность сортировки по убыванию\
 возрастанию для всех полей класса

 * Достаточно легко реализовать возможность сортировки по возрастанию
 и убыванию для каждого из полей класса, добавив в перечисление, например,
 поле ascend типа boolean, от значения которого поставить в зависимость знак
 числа, возвращаемого методом compare(). Перечисление ItemEnum будет вы-
 глядеть следующим образом:
 */
public enum FullItemEnum {
    ITEM_ID(true), PRICE(false), NAME(true);
    private boolean ascend;
    private FullItemEnum(boolean ascend) {
        this.ascend = ascend;
    }
    public void setAscend(boolean ascend) {
        this.ascend = ascend;
    }
    public boolean getAscend() {
        return ascend;
    }
}
