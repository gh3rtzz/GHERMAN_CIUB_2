package lecture_nr_20;

import java.util.concurrent.TimeUnit;

public class CachedData {

    private boolean flag = false;

    public void toggleFlag(){
        flag = !flag;
    }

    public boolean isReady(){
        return flag;
    }

    public static void main(String[] args) {

        CachedData cachedData = new CachedData();

        Thread writerThread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedData.toggleFlag();
            System.out.println("WRITER THREAD: The flag is ready!");
        });

        Thread readThread = new Thread(() -> {
            while(!cachedData.isReady()){

            }
            System.out.println("READ THREAD: Flag is ready!");
        });

        writerThread.start();
        readThread.start();
    }
}
