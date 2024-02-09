package ConsoleBank;

import java.util.Scanner;

public class Banking {

    private String name;
    private int account;
    private static int a=1001;
    
    public static Scanner sc = new Scanner(System.in);
    private double balance;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAccount() {
        return account;
    }
    public void setAccount(int account) {
        this.account = account;
    }
    public static int getA() {
        return a;
    }
    public static void setA(int a) {
        Banking.a = a;
    }
    public static Scanner getSc() {
        return sc;
    }
    public static void setSc(Scanner sc) {
        Banking.sc = sc;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // open account method...
    public void open()
    {
        System.out.println("Enter name,balance");
        name = sc.next();
        balance=sc.nextDouble();
        account = a++;
        System.out.println("Your Account No: "+account);
    }

    public void withdrawl(double b)
    {
        if(balance<b)
        {
            System.out.println("Insufficiect Balance");
        }
        else
        {
            balance = balance-b;
            System.out.println("New Balance: "+balance);
        }
    }

    public void deposits(Double d)
    {
        balance = balance +d;
        System.out.println("New Balance after Deposits: "+balance);
    }
}
