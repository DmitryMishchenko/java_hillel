package l22_multithreading.threads_and_executors_7.singlethreadexecutor_4;

import java.util.concurrent.Callable;

public class SimpleExampleTask implements Callable<String> {
    @Override
    public String call() {
        String threadName = Thread.currentThread().getName();

        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello " + threadName);
        return "Hello";
    }
}
