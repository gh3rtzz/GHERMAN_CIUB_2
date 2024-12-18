package lecture_nr_20;

import java.util.concurrent.TimeUnit;

public class CountDownExample {

    public static void main(String[] args) {

        CountDown countDown = new CountDown(TimeUnit.SECONDS);
        Thread green = new Thread(() -> countDown.countDown(4), ANSI_COLORS.ANSI_GREEN.name());
        Thread blue = new Thread(() -> countDown.countDown(5), ANSI_COLORS.ANSI_BLUE.name());
        Thread red = new Thread(() -> countDown.countDown(7), ANSI_COLORS.ANSI_RED.name());

        green.start();
        blue.start();
        red.start();
    }

}

class CountDown{

    private TimeUnit timeUnit;

    public CountDown(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public void countDown(int unitCount){

        String threadName = Thread.currentThread().getName();

        ANSI_COLORS threadColor = ANSI_COLORS.ANSI_RESET;

        threadColor = ANSI_COLORS.valueOf(threadName);
        String color = threadColor.getColor();

        for(int i = unitCount; i != 0; i--){
            try {
                timeUnit.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(color + "Thread: " + threadName + " i: " + i);
        }
    }
}
