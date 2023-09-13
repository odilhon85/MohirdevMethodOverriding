package uz.dawo;

import uz.dawo.animals.Animal;
import uz.dawo.animals.Cat;
import uz.dawo.animals.Dog;
import uz.dawo.animals.Duck;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Dog("Beethoven");
        System.out.println(dog.getName());
        dog.sound();

        Animal duck = new Duck("Donald");
        System.out.println(duck.getName());
        duck.sound();

        Animal cat = new Cat("Figaro");
        System.out.println(cat.getName());
        cat.sound();
    }
}
