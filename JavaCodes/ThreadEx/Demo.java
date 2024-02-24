package ThreadEx;

class A extends Thread {
    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("In A show..");
        }
    }
}

class B extends Thread {

    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("In B show..");
        }

    }
}

public class Demo {

    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();
        ob1.start();
        ob2.start();
    }
}
