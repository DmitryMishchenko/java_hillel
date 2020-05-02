package l14_l15_listener.animals;

public class Animal {

    public int id;

    private int age;

    private String name;

    public boolean isSick() {
        return isSick;
    }

    public void sick() {
        isSick = true;
    }

    public void healed() {
        isSick = false;
    }

    private boolean isSick;

    public Animal(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
               "id=" + id +
               ", age=" + age +
               ", name='" + name + '\'' +
               ", isSick=" + isSick +
               '}';
    }

}
