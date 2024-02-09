package InnerClassEx;

public class AnonymousEX {
public static void main(String[] args) {
    Age obj = new Age(){
        @Override
        public void show() {
           System.out.println("Inside a anonoymous class..");
        }
    };
    obj.show();
}
    
}
