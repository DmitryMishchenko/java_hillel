package l22_multithreading.threads_and_executors_7.simple_example_1;

public class SimpleExample {
    public static void main(String[] args) {
        Runnable task = new SimpleExampleTask();
        task.run();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Done!");
    }
}
