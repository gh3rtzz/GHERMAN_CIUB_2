package lecture_nr_3.partA;

public class Main {

    public static void main(String[] args) {

        int x = 4;

        int r = multiplyByTwo(x);

        System.out.println(r);

        bark();

        isOddOrEven(x);
    }

    public static boolean isEven(int inputNumber){

        if(inputNumber % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void isOddOrEven(int inputNumber){

        if(inputNumber % 2 == 0){
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }

    public static int multiplyByTwo(int inputNumber){

        int result = inputNumber * 2;
        return result;
    }

    public static void bark(){
        System.out.println("Woof! Woof!");
    }


}
