package ThreadEx;

class X implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside X class...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Y implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Y class...");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo2 {

    public static void main(String[] args) {

        // metod 1....

        // X ob1 = new X();
        // Y ob2 = new Y();

        // Thread t1 = new Thread(ob1);
        // Thread t2 = new Thread(ob2);

        // t1.start();
        // t2.start();

        // method 2...

        Runnable ob1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Inside X class...  anonymous fn");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Inside X class...");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        t1.start();
        t2.start();
    }
}
