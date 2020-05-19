package l7_polymorphism;

public class Hamster extends Pet {
  public Hamster(int age, int weight, String color, String name) {
    super(age, weight, color, name);
  }

  public void showFluffiness() {
    System.out.println("So fluffy, hard to imagine");
  }
}
