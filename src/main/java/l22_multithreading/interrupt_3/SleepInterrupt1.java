package l22_multithreading.interrupt_3;

public class SleepInterrupt1 implements Runnable {
    @Override
    public void run() {
        System.out.println("in run is about to sleep for 20 seconds");
        while(true){
            System.out.println("Doing");
            if(Thread.currentThread().isInterrupted()){




                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        System.out.println("Doing stuff after nap");
//        System.out.println("Leaving normally");
    }
}
