package l7_polymorphism;

public class Wolf extends WildAnimal {
  public Wolf(int age, int weight, String color, boolean isPredator) {
    super(age, weight, color, isPredator);
  }

  public void startHunting() {
    System.out.println("start hunting");
  }
}
