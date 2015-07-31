package collection.comparator;

import java.util.Comparator;

/**
 * Created by green on 01.08.2015.
 *
 * класс-сущность с внутренними классами-компараторами
 *
 * Класс-компаратор, являясь логической частью класса-сущности, может
 быть его частью и представлен в виде статического внутреннего класса
 Экземпляр компаратора создается обычным для внутренних классов способом
 Item.IdComparator comp = new Item.IdComparator();
 Объявление внутри класса позволяет манипулировать доступом к его функ-
 циональности.
 Интерфейс Comparator не рекомендуется имплементировать классу-сущности,
 для сортировки экземпляров которого он предназначается.
 */
public class Item {
    private int itemId;
    private float price;
    private String name;
    public Item(int itemId, float price, String name) {
        super();
        this.itemId = itemId;
        this.price = price;
        this.name = name;
    }
    public int getItemId() {
        return itemId;
    }
    public float getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public static class IdComparator implements Comparator<Item> {
        @Override
        public int compare(Item one, Item two) {
            return one.getItemId() - two.getItemId();
        }
    }
    public static class PriceComparator implements Comparator<Item> {
        @Override
        public int compare(Item one, Item two) {
            return Double.compare(two.getPrice(), one.getPrice());
        }
    }
}
