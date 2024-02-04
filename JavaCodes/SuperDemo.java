class A
{
    public A()
    {
        System.out.println("Inside Default Constructor of A.");
    }

    public A(int a)
    {
        System.out.println("Inside A : a");
    }

    public A(int a ,int b)
    {
        System.out.println("Inside A: a,b");
    }
}

class B extends A
{
    public B()
    {
        //super();
       // super(0);
      // super(0, 0);
        this(1,2);
        System.out.println("Inside Default Constructor of B.");
    }

    public B(int x)
    {
        System.out.println("Inside B: x");
    }

    public B(int x, int y)
    {
        System.out.println("Inside B: x ,y");
    }
}

public class SuperDemo {

    public static void main(String[] args) {
        B b1 = new B();
    }
    
}
