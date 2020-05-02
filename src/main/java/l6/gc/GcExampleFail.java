package l6.gc;

import l5_basics_oop.Student;

public class GcExampleFail {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5_000);
        System.out.println("Started");
        for (int i = 0; i < 10_000_000; i++) {
            Student student = create();
            if (i % 100 == 0) {
                Thread.sleep(10);
            }
            if (i % 1000 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Finished");
    }

    public GcExampleFail() {
    }

    private static Student create() {

        String biggerName = "";
        for (int i = 0; i < 1000; i++) {
            String name = String.valueOf(Math.random());
            biggerName += name;
        }
        Student strange = new Student();
        strange.setName(biggerName);
        return strange;
    }
}
