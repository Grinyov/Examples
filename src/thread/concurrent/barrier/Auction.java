package thread.concurrent.barrier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CyclicBarrier;
/**
 * Created by green on 30.08.2015.
 *
 * определение барьера и действия по его окончании
 *
 * Процесс проведения аукциона подразумевает корректное использование клас-
 са CyclicBarrier. Класс Auction определяет список конкурирующих предложений
 от клиентов и размер барьера. Чтобы приложение работало корректно, необходи-
 мо, чтобы размер списка совпадал со значением константы BIDS_NUMBER.
 Барьер инициализируется потоком определения победителя торгов, который
 запустится после того, как все предложения будут объявлены. Если потоков
 будет запущено больше чем размер барьера, то «лишние» предложения могут
 быть не учтены при вычислении победителя, если же потоков будет меньше,
 то приложение окажется в состоянии deadlock. Для предотвращения подобных
 ситуаций следует использовать метод await() с параметрами.
 */

public class Auction {

    private ArrayList<Bid> bids;
    private CyclicBarrier barrier;
    public final int BIDS_NUMBER = 5;
    public Auction() {
        this.bids = new ArrayList<Bid>();
        this.barrier = new CyclicBarrier(this.BIDS_NUMBER, new Runnable() {
            public void run() {
                Bid winner = Auction.this.defineWinner();
                System.out.println("Bid #" + winner.getBidId() + ", price:" + winner.getPrice() + " win!");
            }
        });
    }
    public CyclicBarrier getBarrier() {
        return barrier;
    }
    public boolean add(Bid e) {
        return bids.add(e);
    }
    public Bid defineWinner() {
        return Collections.max(bids, new Comparator<Bid>() {
            @Override
            public int compare(Bid ob1, Bid ob2) {
                return ob1.getPrice() - ob2.getPrice();
            }
        });
    }
}