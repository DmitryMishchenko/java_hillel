package l7_polymorphism;

public abstract class WildAnimal extends Animal {
  private boolean isPredator;

  public WildAnimal(int age, int weight, String color, boolean isPredator) {
    super(age, weight, color);
    this.isPredator = isPredator;
  }

  @Override
  public String makeVoice() {
    return "Hello, I am a wild animal. ";
  }

  public boolean isPredator() {
    return isPredator;
  }

  public void setPredator(boolean predator) {
    isPredator = predator;
  }
}
