package lecture_nr_13;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AnotherMain {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        divideBy0();
    }

    public static int readIntFromKeyboard(){
        while(true) {
            try {
                scanner = new Scanner(System.in);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Something went wrong! Please try again!");
            }
        }
    }

    public static void divideBy0(){
        System.out.println("Please enter the first number");
        int x = readIntFromKeyboard();
        System.out.println("Please enter the second number");
        int y = readIntFromKeyboard();

        try {
            System.out.println("Division: " + x / y);
        } catch (ArithmeticException e){
            System.out.println("Can't divide! Divisor is 0!");
        }
    }
}
