package l22_multithreading.atomic_6;

public class Incrementor {
    private String id;
    private Object monitor;
    private Object monitor2;

    public Incrementor(String id, Object monitor, Object monitor2) {
        this.id = id;
        this.monitor = monitor;
        this.monitor2 = monitor2;
    }

    public void increment() {
        synchronized (monitor) {
            try {


                System.out.println("Start inc: " + " " + Thread.currentThread().getName());
                Thread.sleep(500);
                doSmth();
                System.out.println("End inc: " + " " + Thread.currentThread().getName() + "\n");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doSmth() {
        synchronized (monitor2) {
            try {


                System.out.println("Start do smth: " + " " + Thread.currentThread().getName());
                Thread.sleep(500);
                increment();
                System.out.println("End do smth: " + " " + Thread.currentThread().getName());


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "Incrementor{" +
               "id='" + id + '\'' +
               '}';
    }
}
