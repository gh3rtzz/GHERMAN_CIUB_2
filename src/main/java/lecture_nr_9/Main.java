package lecture_nr_9;

public class Main {

    public static void main(String[] args) {

        Car c1 = new Car("123123123", "BMW", "M4", false, 440);
        Car c2 = new Car("123123123", "BMW", "M4", false, 440);
        Boat b1 = new Boat("kasdkj123", "Lamborghini", "Fortuna", 2, 35000, 50);
        Boat b2 = new Boat("kasdkj123", "Lamborghini", "Fortuna", 2, 35000, 50);
        Boat b3 = new Boat("kasdkj123", "Lamborghini", "Fortuna", 2, 35000, 50);
        Plane p1 = new Plane("asdklasjdkla123", "Boeing", "737-Max", 180, true);
        Plane p2 = new Plane("asdklasjdkla123", "Boeing", "737-Max", 180, true);
        Plane p3 = new Plane("asdklasjdkla123", "Boeing", "737-Max", 180, true);


        c1.drive();
        b1.swim();
        b1.dock();
        p1.cruise();
        p1.takeOff();
        p1.land();
        Human h1 = new Human();


        Vehicle[] vehicles = new Vehicle[]{
                c1, c2, b1, b2, b3, p1, p2, p3
        };

        Swimmable[] swimmables = new Swimmable[]{
                b1, b2, b3, h1
        };

        Flyable[] flyables = new Flyable[]{
                p1, p2, p3
        };

        Drivable[] drivables = new Drivable[]{
                c1, c2
        };

        System.out.println("-----------------------");
        for(int i = 0; i != swimmables.length; i++){
            swimmables[i].dock();
//            Vehicle v1 = (Vehicle) swimmables[i]; Won't Work!
//            System.out.println(v1.VIN);

            if(swimmables[i] instanceof Vehicle){
                System.out.println("true!");
            }
        }

        if(p1 instanceof Vehicle){
            System.out.println("p1 is flyable!");
        }

        //Vehicle v1 = (Vehicle) swimmables[0] // Bad idea

        Vehicle v2 = p1;
        Flyable f2 = p1;

        for(int i = 0; i != vehicles.length; i++){

            if(vehicles[i] instanceof Swimmable){
                System.out.println(vehicles[i].model);
            }
        }

        Flyable.engineFireProtocol();

        c1.move();
        p1.move();
        b1.move();
    }
}
