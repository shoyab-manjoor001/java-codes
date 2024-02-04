public class OverLoadingDemo {

    void area(int l)
    {
        System.out.println("Area of Square: "+(l*l));
    }

    int area(int l ,int b)
    {
        return l*b;
    }

    void area(float r)
    {
        System.out.println("Area of Circle: "+(3.14*r*r));
    }

    public static void main(String[] args) {
        
        OverLoadingDemo ob = new OverLoadingDemo();
        ob.area(5);
        ob.area(1.0f);
        System.out.println(ob.area(2, 3));
    }
}
