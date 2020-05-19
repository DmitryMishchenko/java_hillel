package l7_polymorphism;

public abstract class Pet extends Animal {
  private boolean isVaccinated = false;
  private String name;

  public Pet(int age, int weight, String color, String name) {
    super(age, weight, color);
    this.name = name;
  }

  public boolean isVaccinated() {
    return isVaccinated;
  }

  public void setVaccinated(boolean vaccinated) {
    isVaccinated = vaccinated;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null || name.isEmpty()) return;
    this.name = name;
  }

  @Override
  public String makeVoice() {
    return "Hello, my name is " + this.name + ". ";
  }
}
