package lecture_nr_3.partB;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "M4", 2018);
        Car car2 = new Car("Audi", "RS6", 2017);

        car1.isCrashed = true;

        System.out.println(car2.isCrashed);

        car1.printCarDetails();
    }
}
