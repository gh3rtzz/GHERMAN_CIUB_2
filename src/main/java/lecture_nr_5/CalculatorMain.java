package lecture_nr_5;

public class CalculatorMain {

    public static void main(String[] args) {

        System.out.println(Calculator.addition(2,2));
        System.out.println(Calculator.subtraction(6,2));
        System.out.println(Calculator.multiplication(2,2));
        System.out.println(Calculator.division(10,3));
        System.out.println(Calculator.addMultiple(1, 3, 6, 4, 5, 8));

        int[] intArray = new int[]{
                1, 3, 6, 4, 5, 8
        };
        System.out.println(Calculator.addMultiple2(intArray));

        System.out.println(CalculatorOptimized.calculate('+', 1, 2, 3));
        System.out.println(CalculatorOptimized.calculate('-', 1, 2, 3));
        System.out.println(CalculatorOptimized.calculate('*', 1, 2, 3));
        System.out.println(CalculatorOptimized.calculate('/', 9, 2, 3));
        System.out.println(CalculatorOptimized.calculate('/', 9, 0, 3));
        System.out.println(CalculatorOptimized.calculate('/', 9));
        System.out.println(CalculatorOptimized.calculate('|', 9, 7, 15, 8));


    }
}
