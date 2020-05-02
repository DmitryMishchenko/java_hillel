package l22_multithreading.threads_and_executors_7.singlethreadexecutor_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by VSulevskiy on 08.05.2015.
 */
public class SingleThreadExecutorExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Future<String> f = executor.submit(new SimpleExampleTask());
        Future<String> s = executor.submit(new SimpleExampleTask());
        Future<String> t = executor.submit(new SimpleExampleTask());

        System.out.println("Done");
        //        try {
        System.out.println("attempt to shutdown executor");
        executor.shutdown();
        System.out.println("After shutdown");
        executor.awaitTermination(3, TimeUnit.SECONDS);
        f.cancel(true);

        System.out.println("After termination");
        //        } catch (InterruptedException e) {
        //            System.out.println("task interrupted");
        //        } finally {
        //            if (!executor.isTerminated()) {
        //                System.out.println("cancel non-finished tasks");
        //            }
//        executor.shutdownNow();
        System.out.println("shutdown finished");
        //        }
    }
}
