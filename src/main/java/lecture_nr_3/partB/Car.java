package lecture_nr_3.partB;

public class Car {

    String manufacturer;
    String model;
    int yearOfProduction;
    boolean isCrashed;

    public Car(String manufacturer, String model, int yearOfProduction) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isCrashed = false;
    }

    public void printCarDetails(){

        System.out.println("Car manufacturer is: " + manufacturer);
        System.out.println("Car model is: " + model);
        System.out.println("Car's year of production is: " + yearOfProduction);
        System.out.println("Is the car crashed? " + isCrashed);
    }
}
