package patterns.singleton.v2;

/**
 * Вариант 1 простово синглтона.
 */
public class Dog {
    private String name;
    private int age;

    private Dog () {
        this.name = "Sharik";
        this.age = 5;
    }

    void myau () {
        System.out.println("gav-gav-gav... ");
    }

    public static Dog getInstance(Dog dog) {
        if (dog == null){
            dog = new Dog();
        }
        return dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

