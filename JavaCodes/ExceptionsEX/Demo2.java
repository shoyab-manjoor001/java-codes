package ExceptionsEX;

class A {
    public void show() throws ClassNotFoundException {
        Class.forName("Vote");
    }
}

public class Demo2 {

    static {
        System.out.println("Class Loader Exceuted");
    }

    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception Ocurred...");
            e.printStackTrace();
        }
    }
}
