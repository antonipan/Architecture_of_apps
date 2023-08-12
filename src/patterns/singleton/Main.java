package patterns.singleton;

import patterns.singleton.v1.Cat;
import patterns.singleton.v2.Dog;

public class Main {

    public static void main(String[] args) {

        // Синглтон. Вариант 1.
        Cat cat1 = Cat.getInstance();
        System.out.println(cat1.toString());
        Cat cat2 = Cat.getInstance();
        System.out.println(cat2.toString());
        // Синглтон. Вариант 2.
        Dog dog1 = null;
        Dog dog2 = Dog.getInstance(dog1);
        System.out.println(dog2);
        Dog dog3 = Dog.getInstance(dog1);
        System.out.println(dog3);

        // Синглтон. Вариант 3.



    }

}
