package InheretanceEx;

public class C extends B
{
    int c1;
    public C()
    {
        super();
        c1=0;
    }
    public C(int w, int x, int y ,int z)
    {
        super(w,x,y);
        c1=z;
    }
    public void display()
    {
        super.display();
        System.out.println(c1+" from class C");
    }
}