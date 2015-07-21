package inner;

/**
 * Created by green on 21.07.2015.
 *
 * объявление внутреннего класса
 *
 * Внутреннему классу совершенно не обязательно быть полем класса вла-
 дельца. Внутренний класс может быть использован любым членом своего
 внешнего класса, а может и не использоваться вовсе

 */
public class Ship2 {
    // поля и конструкторы внешнего класса
    public class Engine { // определение внутреннего класса
        // поля и методы
        public void launch() {
            System.out.println("Запуск двигателя");
        }
    } // конец объявления внутреннего класса
// методы внешнего класса
}
