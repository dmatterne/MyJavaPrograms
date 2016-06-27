import java.util.LinkedList;
import java.util.List;

/**
 * Created by stannisbaratheon on 20/06/16.
 */
public class Sharing {
    public static void main(String[] args) {


        Data d = new Data();
        List<String> list = new LinkedList<>();

        new Worker2(list).start();
        new Worker2(list).start();

        new Worker2 (d).start();
        new Worker2 (d).start();




    }


}

class Data {
    private List<String> data;
    public synchronized boolean shouldStop;
    public synchronized void add (String s) {
            data.add(s);
    }

    synchronized signalStop() {
        shouldStop = true;
    }
}


class   Worker2 extends Thread {

    Data data;
    private static Object lock = new Object();
    List<String> data1;

    public Worker2(Data data){
        this.data = data;
    }

    public Worker2(List<String> data) {
        this.data1 = data;
    }

    public void run() {
        while(!data.shouldStop) {
            synchronized (lock) {
                //data1.add("Hello");
                //data.add("Hello");
            }
        }
    }

}
