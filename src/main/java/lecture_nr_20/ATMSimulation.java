package lecture_nr_20;

public class ATMSimulation {

    public static void main(String[] args) {

        BankAccount companyAccount = new BankAccount(10000, "Andrei");

        Thread thread1 = new Thread(() -> companyAccount.deposit(5000));
        Thread thread2 = new Thread(() -> companyAccount.withdraw(30000));
        Thread thread3 = new Thread(() -> companyAccount.setName("Timur"));
        Thread thread4 = new Thread(() -> companyAccount.withdraw(2500));

        thread4.start();
        thread2.start();
        thread3.start();
        thread1.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(companyAccount.getBalance());
    }
}
