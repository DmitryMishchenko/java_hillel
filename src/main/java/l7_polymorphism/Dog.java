package l7_polymorphism;

public class Dog extends Pet {
  public Dog(int age, int weight, String color, String name) {
    super(age, weight, color,  name);
  }

  @Override
  public String makeVoice() {
    return super.makeVoice() + "Woof";
  }
}
