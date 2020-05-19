package l7_polymorphism;

public class Lion extends WildAnimal {
  public Lion(int age, int weight, String color, boolean isPredator) {
    super(age, weight, color, isPredator);
  }

  public void roar() {
    System.out.println("Show who is THE boss");
  }
}
