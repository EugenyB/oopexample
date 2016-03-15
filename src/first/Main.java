package first;

import animals.Animal;
import animals.Cat;
import animals.Dog;


/**
 * Created by eugeny on 15.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();

//        Animal animal = new Animal("Tuzik");
//        System.out.println(animal.getName());
//        //animal.voice();
//
//        System.out.println(animal.toString());
//        System.out.println(animal);

        Dog bobik = new Dog("Bobik");
        System.out.println(bobik);
        bobik.voice();
        bobik.run();

        Cat cat = new Cat("Murka");
        cat.voice();
        cat.run();

        Animal animal1 = new Dog("Tuzik");
        Animal animal2 = new Cat("Tom");
        animal1.voice();
        animal2.voice();
    }
}
