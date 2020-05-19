package l7_polymorphism;

public class Fish extends Animal {
  public Fish(int age, int weight, String color) {
    super(age, weight, color);
  }

  @Override
  public String makeVoice() {
    return "....";
  }
}
