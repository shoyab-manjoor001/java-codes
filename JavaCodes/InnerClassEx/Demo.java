package InnerClassEx;

class A
{
    int age;
    public void show()
    {
        System.out.println("Inside show method of class A.");
    }

// class B
// {
//     public void config()
//     {
//         System.out.println("Inside inner config method of class B.");
//     }
// }

static class B
{
    public void config()
    {
        System.out.println("Inside inner config method of static class B.");
    }
}

}
public class Demo {

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.show();

        // creating inner class object..
        
        // A.B obj2 = new A().new B();
        // obj2.config();


        // example with static keyword...
        A.B obj2 = new A.B();
        obj2.config();
    }
    
}
