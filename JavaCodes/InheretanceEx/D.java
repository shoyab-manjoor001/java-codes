package InheretanceEx;

public class D extends A
{
    int d1;
    public D()
    {
        super();
        d1=0;
    }
    public D(int x,int y,int z)
    {
        super(x, y);
        d1=z;
    }
    public void display()
    {
        super.display();
        System.out.println(d1+" from class D");
    }
}
