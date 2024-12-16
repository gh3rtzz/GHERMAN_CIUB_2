package lecture_nr_19;

public class CustomThread extends Thread{

    @Override
    public void run() {

        for(int i = 1; i < 10; i++){

            System.out.print("0 ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
