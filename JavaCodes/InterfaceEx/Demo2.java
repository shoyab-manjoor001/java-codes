package InterfaceEx;

public class Demo2 {
    
    public static void main(String[] args) {

        System.out.println("Developer1 is using Laptop..");
        Developer developer1 = new Developer();
        developer1.coding(new Laptop()
        );

        System.out.println("\n\nDeveloper2 is using Desktop..");
        Developer developer2 = new Developer();
        developer2.coding(new Desktop()
        );
    }
}
