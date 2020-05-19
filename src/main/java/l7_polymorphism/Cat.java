package l7_polymorphism;

public class Cat extends Pet {
  public Cat(int age, int weight, String color, String name) {
    super(age, weight, color, name);
  }

  @Override
  public String makeVoice() {
    return super.makeVoice() + "Meow";
  }
}
