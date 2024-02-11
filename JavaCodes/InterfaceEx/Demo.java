package InterfaceEx;

public class Demo {
    
    public static void main(String[] args) {

        A ob = new B();
        ob.config();
        ob.show();
        ob.run();

        // X ob2 = new B();
        // ob2.run();

        B ob3 = new B();
        ob3.config();
        ob3.run();
        ob3.show();
        
    }
}
