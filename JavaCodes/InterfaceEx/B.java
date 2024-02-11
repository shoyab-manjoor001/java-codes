package InterfaceEx;

public class B implements A , X{

    @Override
    public void show() {
        System.out.println("Inside show Method of B");
        System.out.println(B.age);
        System.out.println(B.area);
    }

    @Override
    public void config() {
        System.out.println("Inside config method of B");
    }

    @Override
    public void run() {
        System.out.println("Inside run method...");
    }

    @Override
    public int show(int a) {
       System.out.println("inside int method of show..");
       return a;
    }
    
}
