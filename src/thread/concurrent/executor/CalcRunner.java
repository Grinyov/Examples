package thread.concurrent.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * Created by green on 30.08.2015.
 *
 * запуск потока и извлечение результата его выполнения
 *
 * Интерфейс Callable представляет поток, возвращающий значение вызываю-
 щему потоку. Определяет один метод V call() throws Exception, в код реализации
 которого и следует поместить решаемую задачу. Результат выполнения метода
 call() может быть получен через экземпляр класса Future, методами V get() или
 V get(long timeout, TimeUnit unit) Перед извлечением результатов работы потока Callable можно прове-
 рить, завершилась ли задача успешно, методами isDone() и isCancelled() соот-
 ветственно.
 */
public class CalcRunner {

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        Future<Number> future = es.submit(new CalcCallable());
        es.shutdown();
        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
