package l7_polymorphism;

public class Crocodile extends WildAnimal {
  public Crocodile(int age, int weight, String color, boolean isPredator) {
    super(age, weight, color, isPredator);
  }

  public void showTeeth() {
    System.out.println("shot teeth and demonstrate flesh breath");
  }
}
