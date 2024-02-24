package ThreadEx;

class A extends Thread {
    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("In A show..");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {

    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.println("In B show..");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class Demo {

    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();

        ob1.setPriority(Thread.MAX_PRIORITY);
        ob1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ob2.start();
    }
}
