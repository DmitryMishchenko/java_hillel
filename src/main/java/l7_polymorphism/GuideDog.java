package l7_polymorphism;

public class GuideDog extends Dog {
  private boolean isTrained = false;

  public GuideDog(int age, int weight, String color, String name) {
    super(age, weight, color, name);
  }

  public boolean isTrained() {
    return isTrained;
  }

  public void setTrained(boolean trained) {
    isTrained = trained;
  }

  public void takeHome() {
    System.out.println("We are home now");
  }

  @Override
  public String makeVoice() {
    return super.makeVoice() + (isTrained ? "I can take you home." : "");
  }
}
