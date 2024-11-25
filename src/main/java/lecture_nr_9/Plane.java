package lecture_nr_9;

public class Plane extends Vehicle implements Flyable, Movable{

    int passangerPlaces;
    boolean isReactiveEngine;

    public Plane(String VIN, String manufacturer, String model, int passangerPlaces, boolean isReactiveEngine) {
        super(VIN, manufacturer, model);
        this.passangerPlaces = passangerPlaces;
        this.isReactiveEngine = isReactiveEngine;
    }

    @Override
    public void cruise() {
        System.out.println("The " + model + " is cruising...");
    }

    @Override
    public void takeOff() {
        System.out.println("The plane is taking off...");
    }

    @Override
    public void land() {
        System.out.println("The plane landed!");
    }

    @Override
    public void move() {
        System.out.println("The plane is moving!");
    }
}
