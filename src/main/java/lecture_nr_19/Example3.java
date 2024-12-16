package lecture_nr_19;

import java.util.concurrent.TimeUnit;

public class Example3 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {

            for(int i = 0; i != 10; i++){
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                    System.out.print(". ");
                } catch (InterruptedException e) {
                    System.out.println("Whoops! I've been interrupted!");
                    System.out.println(Thread.currentThread().isInterrupted());
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });

        t1.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t1.interrupt();

        System.out.println("--------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.isInterrupted());

        Thread t3 = new Thread(() -> {
            System.out.println(t1.isInterrupted());
        });

        t3.start();
    }
}
