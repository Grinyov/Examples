package thread.concurrent.executor;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by green on 30.08.2015.
 *
 * поток с возвращением результата
 *
 * В альтернативной системе управления потоками разработан механизм ис-
 полнителей, функции которого заключаются в запуске отдельных потоков и их
 групп, а также в управлении ими: принудительной остановке, контроле числа
 работающих потоков и планирования их запуска.
 Класс ExecutorService методом execute(Runnable thread) запускает тради-
 ционные потоки, метод же submit(Callable<T> task) запускает потоки с воз-
 вращаемым значением. Метод shutdown() останавливает все запущенные им
 ранее потоки и прекращает действие самого исполнителя. Статические методы
 newSingleThreadExecutor() и newFixedThreadPool(int numThreads) класса
 Executors определяют правила, по которым работает ExecutorService, а имен-
 но первый позволяет исполнителю запускать только один поток, второй —
 не более чем указано в параметре numThreads, ставя другие потоки в очередь
 ожидания окончания уже запущенных потоков.
 */
public class CalcCallable implements Callable<Number> {
    @Override
    public Number call() throws Exception {
        Number res = new Random().nextGaussian(); // имитация вычислений
        return res;
    }
}
