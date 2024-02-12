import InterfaceEx.DemoInterface;
import InterfaceEx.DemoInterface2;

public class LamdaExpressionDemo {

    public static void main(String[] args) {
        DemoInterface di = () -> {
            System.out.println("Inside Lamda Expression Class");
        };
        System.out.println("\nPrinting data through Demo Interface");
        di.priting();

        DemoInterface2 di2 = (x, y) -> x + y;
        System.out.println("\nPrinting data through Demo Interface2");
        System.out.println(di2.sumofTwoNumber(20, 30));
    }

}
