package lecture_nr_13;

public class Main {

    public static void main(String[] args) {

        divideBy0LYBL(3, 0);
        divideBy0EAFP(3, 0);
        System.out.println(3 / 0);
    }

    public static void divideBy0LYBL(int x, int y){
        if(y == 0){
            System.out.println("Can't divide, divisor is 0");
        } else {
            System.out.println(x / y);
        }
    }

    public static void divideBy0EAFP(int x, int y){

        try{
            System.out.println(x / y);
            System.out.println("GOT HERE!");
        } catch (ArithmeticException e){
            System.out.println("Can't divide, divisor is 0");
            e.printStackTrace();
        }
    }



    public static void divideBy0EAFPMultipleExceptions(String x, String y){

        try{
            System.out.println(Integer.parseInt(x) / Integer.parseInt(y));
            System.out.println("GOT HERE!");
        } catch (ArithmeticException e){
            System.out.println("Can't divide, divisor is 0");
            e.printStackTrace();
        } catch (NumberFormatException z){
            System.out.println("Can't divide, either of numbers are not numbers");
            z.printStackTrace();
        }
    }
}
