package lecture_nr_9;

public abstract class Vehicle {

    String VIN;
    String manufacturer;
    String model;

    public Vehicle(String VIN, String manufacturer, String model) {
        this.VIN = VIN;
        this.manufacturer = manufacturer;
        this.model = model;
    }
}
