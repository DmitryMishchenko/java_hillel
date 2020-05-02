package l22_multithreading.threads_and_executors_7.simple_example_2;

/**
 * Created by VSulevskiy on 08.05.2015.
 */
public class SimpleExampleAnon {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("Hello " + threadName);
            }
        };
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Done!");
    }


}
