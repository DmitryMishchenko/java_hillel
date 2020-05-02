package l5_basics_oop;

public class Student {

    private String name;

    public String getName() {

        return name;
    }

    @Override
    public void finalize()  {
        System.out.println("Deleted");
    }

    public void setName(String name) {

        this.name = name;
    }

    void greet() {
        System.out.println("Hello, my name is " + name);
    }
}