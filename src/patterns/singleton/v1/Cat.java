package patterns.singleton.v1;

/**
 * Вариант 1 простово синглтона.
 */
public class Cat {
    private static Cat cat;
    private String name;
    private int age;

    private Cat () {
        this.name = "Barsik";
        this.age = 5;
    }

    void myau () {
        System.out.println("Myau-myau-myau... ");
    }

    public static Cat getInstance() {
        if (cat == null){
            cat = new Cat();
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

