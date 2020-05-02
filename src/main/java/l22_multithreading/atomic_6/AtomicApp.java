package l22_multithreading.atomic_6;

/**
 * Created by VSulevskiy on 04.09.2015.
 */
public class AtomicApp {

    public static void main(String[] args) {
        Object monitor = new Object();
        Object monitor2 = new Object();
        Incrementor incrementor = new Incrementor("1", monitor, monitor2);
//        Incrementor incrementor2 = new Incrementor("2", monitor, monitor2);
        //
        Runnable runnableA = new Runnable() {
            @Override
            public void run() {
//                for (int i = 0; i < 10; i++) {
                    incrementor.increment();
//                }
            }
        };
        Runnable runnableB = new Runnable() {
            @Override
            public void run() {
//                for (int i = 0; i < 10; i++) {
                    incrementor.doSmth();
//                }
            }
        };
        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);
        threadA.start();
        threadB.start();

        //        try {
        //            TimeUnit.SECONDS.sleep(10);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
