package lecture_nr_19;

import java.util.concurrent.TimeUnit;

public class Example2 {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " should take 10 dots to run.");
            for(int i = 0; i != 10; i++){
                System.out.print(". ");

                try {
                    TimeUnit.MILLISECONDS.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Whoops! Thread was interrupted!");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            System.out.println(Thread.currentThread().getName() + " finished!");
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 3; i++){

                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                    System.out.println("Installation Step " + (i + 1) + " is completed");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "InstallationThread");

//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


//        try {
//            t1.join(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        t2.start();

        Thread threadMonitor = new Thread(() -> {

            long now = System.currentTimeMillis();

            while(t1.isAlive()){

                try {
                    TimeUnit.SECONDS.sleep(1);

                    if(System.currentTimeMillis() - now > 2000){
                        t1.interrupt();
                        Thread.sleep(100);
                        System.out.println("FROM MONITOR: " + t1.isInterrupted());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread Monitor");

        t1.start();
        threadMonitor.start();
//        t1.interrupt();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(!t1.isInterrupted()){
            t2.start();
        } else {
            System.out.println("Previous thread was interrupted, " + t2.getName() + " can't run");
        }
    }
}
