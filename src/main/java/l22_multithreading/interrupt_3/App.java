package l22_multithreading.interrupt_3;

/**
 * Created by VSulevskiy on 19.07.2015.
 */
public class App {
    public static void main(String[] args) {
        SleepInterrupt1 sleepInterrupt = new SleepInterrupt1();
        Thread t = new Thread(sleepInterrupt);
        t.start();

        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            //
        }
        System.out.println("In main interrupting other thread");
        t.interrupt();
        System.out.println("In main leaving");

    }
}
