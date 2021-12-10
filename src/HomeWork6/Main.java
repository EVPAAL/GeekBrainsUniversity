package HomeWork6;

import HomeWork6.Animals.Animal;
import HomeWork6.Animals.Cat;
import HomeWork6.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(50);
            animals[i].swim(5);
        }
    }
}
