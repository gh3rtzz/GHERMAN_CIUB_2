package lecture_nr_21;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadSafeCollectionsExample {

    public static void main(String[] args) {


        ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(100);
        Random random = new Random();

        for(int i = 0; i != 1000; i++){

            blockingQueue.offer(random.nextInt(1, 1000000));
//            blockingQueue.offer(i);
        }

        System.out.println(blockingQueue);

        Runnable run1 = () -> {

            Integer polledInt = blockingQueue.poll();
            while(polledInt != null) {
                try {
                    TimeUnit.MILLISECONDS.sleep(random.nextInt(1, 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("MULTIPLYING: " + polledInt + " RESULT: " + polledInt * 2 + " " + Thread.currentThread().getName());
                polledInt = blockingQueue.poll();
            }
        };

        ExecutorService threadPool1 = Executors.newFixedThreadPool(10);

        while(!blockingQueue.isEmpty()){
            threadPool1.submit(run1);
        }

        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for(int i = 0; i != 1000; i++){

            blockingQueue.offer(random.nextInt(1, 1000000));
//            blockingQueue.offer(i);
        }
        System.out.println("Exited the sleep starting a new loop");

        while(!blockingQueue.isEmpty()){
            threadPool1.submit(run1);
        }

        threadPool1.shutdown();
    }
}
