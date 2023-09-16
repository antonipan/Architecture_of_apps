package solid;

public class Tuning implements Hydraulics, FullDrive, CruiseControl {
    @Override
    public void cruiseControl(Car car) {
        System.out.println(car.getModel() + ": " +
                "круиз-контроль подключён.");
    }

    @Override
    public void hydraulics(Car car) {
        System.out.println(car.getModel() + ": " +
                "гидравлика руля подключена.");
    }

    @Override
    public void fullDrive(Car car) {
        System.out.println(car.getModel() + ": " +
                "полный привод подключён.");
    }
}
