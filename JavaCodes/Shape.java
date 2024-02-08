class Rectangle
{
    int l,b;
    
    public Rectangle()
    {
        l=b=0;
    }

    public Rectangle(int l, int b)
    {
        this.l=l;
        this.b=b;
    }

    public int area(int x,int y)
    {
        int A;
        A=x*y;
      //  System.out.println(A);
        return A;
    }
}

class Cuboid extends Rectangle
{
    int volume, h;

    public Cuboid()
    {
        super();
        h=0;
    }

    public Cuboid(int x, int y , int z)
    {
        super(x,y);
        h=z;
    }

    public int Volume(int x,int y,int z)
    {
            return x*y*z;
    }
}

public class Shape {
    
}
