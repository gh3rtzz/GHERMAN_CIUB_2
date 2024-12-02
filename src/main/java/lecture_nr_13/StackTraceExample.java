package lecture_nr_13;

public class StackTraceExample {

    public static void main(String[] args) {

        int a = 3;
        int b = 0;
        int c = 99;

        try {
            c = a / b;
        } catch (ArithmeticException e){
            e.printStackTrace();
        } finally {
            System.out.println(c);
        }
    }
}
