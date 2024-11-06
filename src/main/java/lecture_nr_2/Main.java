package lecture_nr_2;

public class Main {

    public static void main(String[] args) {

        System.out.println(3 != 3);

        int x = 4;
        int y = 4;

        System.out.println(x != y);

        if(x == y){
            System.out.println("X and Y are equal");
        } else {
            System.out.println("X and Y are not equal");
        }

        // x = 4 y = 4
        // x = 3 y = 4
        if(x > y){
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        if(x == 6){
            System.out.println("X is equal to 6");
        }

        int t = 6;
        int u = 6;

        if(t > u){
            System.out.println("T is greater than U");
        } else if(u > t){
            System.out.println("U is greater than T");
        } else {
            System.out.println("T is equal to U");
        }

        if(t == u){
            System.out.println("T is equal to U");
        } else if (t > u){
            System.out.println("T is greater than U");
        } else {
            System.out.println("U is greater than T");
        }

        int p = 10;
        int o = 4;

        if(p == 3 && o == 4){
            System.out.println("Success!");
        } else {
            System.out.println("Fail!");
        }

        if(p == 10 || o == 10){
            System.out.println("Success");
        } else {
            System.out.println("Fail!");
        }

        int e = 5;

        if(e > 10){
            if(e < 5){
                System.out.println("E is less than 5");
            }
        }

        int num1 = 3;
        int num2 = 6;
        int num3 = 9;

        if(num1 > num2){
            if(num1 > num3){
                System.out.println(num1);
            } else {
                System.out.println(num3);
            }
        } else{
            if(num2 > num3){
                System.out.println(num2);
            } else{
                System.out.println(num3);
            }
        }

        int dayOfWeek = 1;

        switch (dayOfWeek){

            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday");
                break;
            case 5: System.out.println("Friday");
                break;
            case 6: System.out.println("Saturday");
                break;
            case 7: System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid number!");
        }

        int monthNumber = 13;

        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month number!");
        }

        int i = 1; // 1

        while(i <= 20){
            System.out.println(i);
            i++;
        } // 20

        do{
            System.out.println(i);
            i++;
        } while (i <= 20); //21

        for(i = 1; i <= 20; i++){ //1
            System.out.println(i);
        } //20



    }
}
