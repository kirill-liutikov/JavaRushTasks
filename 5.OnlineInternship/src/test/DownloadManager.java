package test;

/**
 * Created by карамба on 19.12.2018.
 */
public class DownloadManager {
    public static void main(String[] args) {
        Thread thread = new Thread();

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {

            }
        });

        thread.start();
    }
}
