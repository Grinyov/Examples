package annotation;

/**
 * Created by green on 27.07.2015.
 *
 * Если необходим доступ к аннотации в процессе функционирования прило-
 жения, то перед объявлением аннотации задается правило сохранения
 RUNTIME в виде кода
 import java.lang.annotation.Retention;
 import java.lang.annotation.RetentionPolicy;
 //@Retention(RetentionPolicy.RUNTIME)
 предоставляющее максимальную продолжительность существования аннотации.
 С правилом SOURCE аннотация существует только в исходном тексте про-
 граммы и отбрасывается во время компиляции. Аннотация с правилом сохра-
 нения CLASS помещается в процессе компиляции в файл имя.class, но недо-
 ступна в JVM во время выполнения.
 *
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BankingAnnotation {
    SecurityLevelEnum securityLevel() default SecurityLevelEnum.NORMAL;
}

/*
пример работы с аннотацией, реализованной на основе ReflectionAPI. Примеры коррект-
ного использования аннотаций короткими не бывают.
Аннотация BankingAnnotation предназначена для задания уровня провер-
ки безопасности при вызове метода.
 */