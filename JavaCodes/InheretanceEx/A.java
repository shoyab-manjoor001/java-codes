package InheretanceEx;

public class A {
    private int a1,a2;
    public A()
    {
        a1=a2=0;
    }
    public A(int x, int y)
    {
        a1=x;
        a2=y;
    }
    public void display()
    {
        System.out.println(a1+" "+a2+" from class A");
    }
}
