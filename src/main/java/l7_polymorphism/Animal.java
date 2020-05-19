package l7_polymorphism;

import java.util.UUID;

public abstract class Animal {
  private UUID id;
  private int age;
  private int weight;
  private String color;

  public UUID getId() {
    return id;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  public int getWeight() {
    return weight;
  }

  public Animal(int age, int weight, String color) {
    this.age = age;
    this.weight = weight;
    this.color = color;
    this.id = UUID.randomUUID();
  }

  public abstract String makeVoice();
}
