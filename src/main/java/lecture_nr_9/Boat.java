package lecture_nr_9;

public class Boat extends Vehicle implements Swimmable, Movable{

    int numberOfEngines;
    int waterStuff;
    int length;

    public Boat(String VIN, String manufacturer, String model, int numberOfEngines, int waterStuff, int length) {
        super(VIN, manufacturer, model);
        this.numberOfEngines = numberOfEngines;
        this.waterStuff = waterStuff;
        this.length = length;
    }

    @Override
    public void swim() {
        System.out.println("The " + model + " is swimming...");
    }

    @Override
    public void dock() {
        System.out.println("The boat is docking....");
    }
}
