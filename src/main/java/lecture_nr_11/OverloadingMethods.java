package lecture_nr_11;

public class OverloadingMethods {

    //OVERLOADED METHODS
    public static void printSomething(String input){
        System.out.println(input);
    }

    public static void printSomething(int input){
        System.out.println(input);
    }

    public static void printSomething(boolean input){
        System.out.println(input);
    }

    public static void printSomething(String input1, int input2, boolean input3){
        System.out.println(input1 + input2 + input3);
    }

    public static void main(String[] args) {

        printSomething("ASD");
        printSomething(3);
        printSomething(false);
        printSomething("asd", 3, true);
    }
}
