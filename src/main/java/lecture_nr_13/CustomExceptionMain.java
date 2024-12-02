package lecture_nr_13;

public class CustomExceptionMain {

    public static void main(String[] args) {

        try {
            throw new NotEnoughHomeworkException("this exception is because there is not enough homework");
        } catch (NotEnoughHomeworkException e) {
            System.out.println("Evghenii threw an exception");
        }

        throwSomething();
    }

    public static void throwSomething(){

        try{
            throw new ArithmeticException();
        } catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("Got here!");
    }
}
