import InheretanceEx.D;

// import  InheretanceEx.A;
// import  InheretanceEx.B;
import  InheretanceEx.C;
//import  InheretanceEx.D;

public class Hybrid
{
    public static void main(String[] args) 
    {
        C ob1 = new C();
        C ob2 = new C(1, 2, 3, 4);

        D ob3 = new D();
        D ob4 = new D(4, 5, 6);

            ob1.display();
            ob2.display();
            ob3.display();
            ob4.display();
    }
}








