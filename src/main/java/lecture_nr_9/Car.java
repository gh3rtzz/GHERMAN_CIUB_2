package lecture_nr_9;

public class Car extends Vehicle implements Drivable, Movable{

    boolean isAWD;
    int horsepower;

    public Car(String VIN, String manufacturer, String model, boolean isAWD, int horsepower) {
        super(VIN, manufacturer, model);
        this.isAWD = isAWD;
        this.horsepower = horsepower;
    }

    @Override
    public void drive() {
        System.out.println("The car is driving....");
    }
}
