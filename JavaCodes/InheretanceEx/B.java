package InheretanceEx;

public class B extends A
{
    private int b1;
    public B()
    {
        super();
        b1=0;
    }
    public B(int x,int y,int z)
    {
        super(x,y);
        b1=z;
    }

    public void display()
    {
        super.display();
        System.out.println(b1+" from class B");
    }
}
