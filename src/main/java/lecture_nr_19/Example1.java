package lecture_nr_19;

import java.util.concurrent.TimeUnit;

public class Example1 {

    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();

        mainThread.setName("Main Thread");
        mainThread.setPriority(10);

//        printThreadState(mainThread);
        CustomThread customThread = new CustomThread();
//        printThreadState(customThread);
//        printThreadState(mainThread);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        printThreadState(customThread);

        Runnable r1 = () -> {
          for(int i = 0; i != 8; i++){
              System.out.print("1 ");

              try {
                  TimeUnit.MILLISECONDS.sleep(250);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
        };

        Thread t2 = new Thread(r1);
        printThreadState(t2);
        printThreadState(customThread);

        customThread.start();
        t2.start();
    }

    public static void printThreadState(Thread thread){

        System.out.println("-----------------");
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread name: " + thread.getName());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Thread state: " + thread.getState());
        System.out.println("Thread group: " + thread.getThreadGroup());
        System.out.println("Thread is alive? : " + thread.isAlive());
        System.out.println("-----------------");
    }
}
