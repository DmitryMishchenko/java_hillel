package l8_interface;

public class Hello {
    public static void main(String[] args) {
        MyContainer container = new MyContainer();
        container.add(new Student("Ivan", "Ivanov"));
        container.add(new Student("Peter", "Petrov"));

        for (Object o : container) {
            System.out.println(o);
        }
    }
}
