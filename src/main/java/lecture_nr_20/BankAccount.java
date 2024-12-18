package lecture_nr_20;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class BankAccount {

    private double balance;
    private String name;
    private final Object nameLock = new Object();
    private final Object balanceLock = new Object();

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void setName(String name) {
        synchronized (nameLock) {
            this.name = name;
            System.out.println("Updated name: " + name);
        }
    }

    public String getName() {
        synchronized (nameLock) {
            return name;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){

        System.out.println("STARTING DEPOSIT: TALKING TO THE TELLER");
        try{
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        try {
            TimeUnit.MILLISECONDS.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (balanceLock) {
            double originalBalance = balance;
            balance += amount;
            promoDollars(amount);
            System.out.println("STARTING BALANCE: " + originalBalance
                    + "DEPOSIT: " + amount + " REMAINING: " + balance);
        }
    }

    public void promoDollars(double amount){

        if(amount >= 5000){
            synchronized (balanceLock) {
                System.out.println("Congratulations!, you earned a promotional deposit!");
                balance += 25;
            }
        }
    }

    public synchronized void withdraw(double amount){

        try{
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double originalBalance = balance;
        if(amount <= balance) {
            balance -= amount;
            System.out.println("STARTING BALANCE: " + originalBalance
                    + "WITHDRAW: " + amount + " REMAINING: " + balance);
        } else {
            System.out.println("STARTING BALANCE: " + originalBalance
                    + "INSUFFICIENT FUNDS!: " + amount + " REMAINING: " + balance);
        }
    }
}
