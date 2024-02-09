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

    AgeAbs obj2 = new AgeAbs() {

        @Override
        public void show() {
        System.out.println("Inside Abstact implemenation method of Abstract Anonymous class..");   
        }    
    };
    obj2.show();
}
    
}
