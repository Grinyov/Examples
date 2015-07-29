package string;

/**
 * Created by Grinyov Vitaliy on 29.07.15.
 *
 * Для классов StringBuffer и StringBuilder не переопределены методы equals()
 и hashCode(), т. е. сравнить содержимое двух объектов невозможно, следова-
 тельно хэш-коды всех объектов этого типа вычисляются так же, как и для клас-
 са Object. При идентичном содержимом у двух экземпляров, размеры буфера
 каждого могут отличаться, поэтому сравнение на эквивалентность объектов
 представляется неоднозначным.
 *
 */
public class EqualsStringBuffer {
    public static void main(String[ ] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer(48);
        sb1.append("Java");
        sb2.append("Java");
        System.out.println(sb1.equals(sb2));
        System.out.print(sb1.hashCode() == sb2.hashCode());
    }
}
