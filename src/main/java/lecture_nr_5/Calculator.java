package lecture_nr_5;

public class Calculator {

    public static int addition(int num1, int num2){

        return num1+num2;
    }

    public static int subtraction(int num1, int num2){

        return num1-num2;
    }

    public static int multiplication(int num1, int num2){

        return num1*num2;
    }

    public static float division(int num1, int num2){

        if(num2 == 0){
            return 0;
        } else {
            float result = num1;
            result = result / num2;
            return result;
        }
    }

    public static int addMultiple(int... integers){

        int result = 0;
        for(int i = 0; i != integers.length; i++){

            result+=integers[i];
        }

        return result;
    }

    public static int addMultiple2(int[] integers){

        int result = 0;
        for(int i = 0; i != integers.length; i++){

            result+=integers[i];
        }

        return result;
    }
}
