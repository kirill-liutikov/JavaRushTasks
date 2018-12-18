package test;

/**
 * Created by карамба on 18.12.2018.
 */
public class DaemonTest {

    public static void main(String[] args) {
        new WorkerThread().start();

        try {
            Thread.sleep(7500);
        } catch (InterruptedException e) {
        }

        System.out.println("Main Thread ending") ;
    }

}

class WorkerThread extends Thread {

    public WorkerThread() {
        setDaemon(false);
    }

    public void run() {
        int count = 0;

        while (true) {

            System.out.println("Hello from Worker "+count++);

            try {
                sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }
}