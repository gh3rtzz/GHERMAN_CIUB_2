package lecture_nr_21;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args) {

        MessageRepository messageRepository = new MessageRepository();

        Thread reader = new Thread(new MessageReader(messageRepository));
        Thread writer = new Thread(new MessageWriter(messageRepository));

        writer.start();
        reader.start();
    }
}

class MessageRepository {

    private String message;
    private boolean hasMessage = false;

    public synchronized String read(){

        while(!hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        hasMessage = false;
        notifyAll();
        return this.message;
    }

    public synchronized void write(String message){

        while(hasMessage){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        hasMessage = true;
        notifyAll();
    }
}

class MessageWriter implements Runnable{

    private MessageRepository messageRepository;

    private String[] messages = new String[]{
            "Hello!",
            "World!",
            "This is a message",
            "Finished!"
    };

    public MessageWriter(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    public void run() {

        Random random = new Random();

//        for(int index = 0; index != messages.length; index++){
////            System.out.println("STARTED WRITER");
//            try {
//                TimeUnit.MILLISECONDS.sleep(random.nextInt(500, 2000));
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            messageRepository.write(messages[index]);
//        }

        String bufferString = "";
        Scanner scanner = new Scanner(System.in);
        while(!bufferString.equals("Finished!")){
            bufferString = scanner.nextLine();
            messageRepository.write(bufferString);
            scanner = new Scanner(System.in);
        }
    }
}

class MessageReader implements Runnable{

    private MessageRepository messageRepository;

    public MessageReader(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }


    @Override
    public void run() {

        Random random = new Random();
        String latestMessage = "";
        do{
//            System.out.println("STARTED READER");
            try {
                TimeUnit.MILLISECONDS.sleep(random.nextInt(500, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latestMessage = messageRepository.read();
            System.out.println(latestMessage);
        } while (!latestMessage.equals("Finished!"));
    }
}
