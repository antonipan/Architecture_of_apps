package solid;

public abstract class Car {
    /**
     * model - модель автомобиля
     * power - мощность в лошадиных силах
     */
    private String model;
    private int power;

    public Car(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Car() {}


    public String getModel() {
        return model;
    }

    public int getPower() {
        System.out.println("Power: " + this.power);
        return power;
    }
}
