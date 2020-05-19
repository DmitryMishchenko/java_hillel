package l7_polymorphism;

public class Giraffe extends WildAnimal {
  public Giraffe(int age, int weight, String color, boolean isPredator) {
    super(age, weight, color, isPredator);
  }

  public void swingNeck() {
    System.out.println("Start swinging");
  }
}
