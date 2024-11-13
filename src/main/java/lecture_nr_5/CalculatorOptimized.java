package lecture_nr_5;

public class CalculatorOptimized {

    public static float calculate(char operation, int... integers) {

        if (integers.length == 1) {
            return integers[0];
        } else if (integers.length == 0) {
            return 0;
        } else
        {
            float result = integers[0];
            switch (operation) {
                case '+':
                    for (int i = 1; i != integers.length; i++) {
                        result += integers[i];
                    }
                    break;
                case '-':
                    for (int i = 1; i != integers.length; i++) {
                        result -= integers[i];
                    }
                    break;
                case '*':
                    for (int i = 1; i != integers.length; i++) {
                        result *= integers[i];
                    }
                    break;
                case '/':
                    for (int i = 1; i != integers.length; i++) {
                        if (integers[i] == 0) {
                            return integers[0];
                        } else {
                            result /= integers[i];
                        }
                    }
                    break;
                default:
                    return 0;
            }
            return result;
        }
    }
}
