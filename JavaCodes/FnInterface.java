import InterfaceEx.Helper;
import InterfaceEx.InFnInterface;

public class FnInterface {

    public static void main(String[] args) {
        InFnInterface ob = new InFnInterface() {

            @Override
            public void show() {
                System.out.println("Inside show method.... by Anonymous function.");
            }

        };

        ob.show();
        Helper h = new Helper();
        h.show();
    }
}
