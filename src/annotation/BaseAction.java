package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by green on 27.07.2015.
 *
 * многочленная аннотация класса
 *
 *
 * Ключевому слову interface предшествует символ @. Такая запись сообщает
 компилятору об объявлении аннотации.
 */
@Target(ElementType.TYPE)
public @interface BaseAction {
    int level();
    String sqlRequest();
}