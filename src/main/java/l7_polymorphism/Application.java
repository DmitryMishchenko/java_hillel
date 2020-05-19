package l7_polymorphism;

public class Application {
  public static void main(String[] args) {
    // 1 Animal
    // __ 2 Fish
    // __ 2 Pet
    //   ____ 3 Hamster
    //   ____ 3 Dog
    //         _______ 4 GuideDog
    //   ____ 3 Cat
    // __ 2 WildAnimal
    //   ____ 3 Lion
    //   ____ 3 Giraffe
    //   ____ 3 Crocodile
    //   ____ 3 Wolf

//    GuideDog is a Dog,
//    Dog is a Pet
//    Pet is an Animal

    Hamster hamster = new Hamster(1, 10, "brown", "homa");
    Cat cat = new Cat(1, 10, "red", "catty");
    GuideDog guideDog = new GuideDog(1, 10, "red", "dog");
    guideDog.setTrained(true);
    Wolf wolf = new Wolf(1, 10, "red", true);

    Animal[] animals = new Animal[]{hamster, cat, guideDog, wolf};

    for (Animal animal: animals) {
      System.out.println(animal.makeVoice());
    }

    hamster.showFluffiness();
  }
}
