package annotation;

import interfaces.AccountOperationManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by green on 27.07.2015.
 *
 * создание прокси-экземпляра, включающего функциональность SecurityLogic
 *
 * Вызов метода createSecurityObject(), регистрирующего методы класса для обра-
 ботки аннотаций, можно разместить в конструкторе некоторого промежуточного
 абстрактного класса, реализующего интерфейс AccountOperationManager, или
 в статическом логическом блоке самого интерфейса. Тогда реагировать на аннота-
 ции будут все методы всех реализаций интерфейса AccountOperationManager.
 Класс, определяющий действия приложения в зависимости от значения
 SecurityLevelEnum, передаваемого в аннотированный метод

 Статический метод createSecurityObject(Object targetObject) класса-фа-
 брики создает для экземпляра класса AccountOperationManagerImpl экзем-
 пляр-заместитель, обладающий кроме всех свойств оригинала возможностью
 неявного обращения к логике, выбор которой определяется выбором значения
 для поля аннотации.
 */
public class SecurityFactory {
    public static AccountOperationManager createSecurityObject(
            AccountOperationManager targetObject) {
        return (AccountOperationManager) Proxy.newProxyInstance(
                targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                new SecurityInvokationHandler(targetObject));
    }
    private static class SecurityInvokationHandler implements InvocationHandler {
        private Object targetObject = null;
        public SecurityInvokationHandler(Object targetObject) {
            this.targetObject = targetObject;
        }
        public Object invoke(Object proxy, Method method, Object[ ] args)
                throws Throwable {
            SecurityLogic logic = new SecurityLogic();
            Method realMethod = targetObject.getClass().getMethod(
                    method.getName(),
                    (Class[]) method.getGenericParameterTypes());
            BankingAnnotation annotation = realMethod
                    .getAnnotation(BankingAnnotation.class);
            if (annotation != null) {
// доступны и аннотация и параметры метода
                logic.onInvoke(annotation.securityLevel(), realMethod, args);
                try {
                    return method.invoke(targetObject, args);
                } catch (InvocationTargetException e) {
                    System.out.println(annotation.securityLevel());
                    throw e.getCause();
                }
            } else {
/* в случае если аннотирование метода обязательно следует
генерировать исключение на факт ее отсутствия */
/* throw new InvocationTargetException(null, "method "
+ realMethod + " should be annotated "); */
// в случае если допустимо отсутствие аннотации у метода
                return null;
            }
        }
    }
}

/*
Использование аннотации может быть обязательным или опциональным. Если
метод invoke() при отсутствии аннотации у метода генерирует исключение,
то это говорит об обязательности явного использования аннотации всеми без
исключения методами класса. Если метод возвращает в этой ситуации значе-
ние null, то аннотированными могут быть только те методы, которые необхо-
димы программисту. Последний вариант использования предпочтителен, так
как не требует обязательного использования аннотации для методов общего
назначения, например: equals() или toString().
 */
