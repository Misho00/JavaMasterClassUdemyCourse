import OOP.Animal;
import OOP.Dog;
import OOP.Fish;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorki = new Dog("Yorki", 15);
        doAnimalStuff(yorki, "fast");

        Dog retreiver = new Dog("Labrador Retreiver", 65, "Floppy", "Swimmer");
        doAnimalStuff(retreiver, "slow");

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }
}
