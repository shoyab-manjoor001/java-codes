class Abc
{
    private int a;
    private int b;

    public void putData()
    {
        a=5;
        b=2;
    }

    public void displayData()
    {
        System.out.println(a+" "+b);
    }
}

class Bcd extends Abc
{
    private int c;

    public void putData()
    {
        super.putData();
        c=15;
    }

    public void displayData()
    {
        super.displayData();
        System.out.println(c);
    }
}

public class C 
{
    public static void main(String[] args) {
        Bcd ob = new Bcd();
        ob.putData();
        ob.displayData();
    }
}
