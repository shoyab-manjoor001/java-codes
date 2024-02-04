class Mobile
{
    static String name;
    String brand;
    /**
     *
     */
    int price;

    static
    {
        name = "SmartPhone";
        System.out.println("Inside Static block");
    }
    public Mobile() {
    }

    public void show()
    {
        System.out.println("Details of the Mobile:");
        System.out.println("Name : "
        +Mobile.name
        +"\nBrand : "
        +this.brand
        +"\nPrice : "
        +this.price+"\n");
    }

    public String getName() {
        return name;
    }

    // public void setName(String name) {
    //     this.name = name;
    // }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // public Mobile(String name,String brand, int price) {
    //     this.name = name;
    //     this.brand = brand;
    //     this.price = price;
    // }

    public Mobile(String brand, int price) {
        this.brand = brand;
        this.price = price;
        System.out.println("Inside Constructor..");
    }

    public static void show1(Mobile mobile)
    {
        System.out.println("Inside Static Method");
        System.out.println("Details of the Mobile:");
        System.out.println("Name : "
        +name
        +"\nBrand : "
        +mobile.brand
        +"\nPrice : "
        +mobile.price+"\n");
    }

}

public class StaticTest {

    public static void main(String args[]) throws ClassNotFoundException {

        // Mobile m1 = new Mobile("Smart phone", "Samsung", 55000);
        // Mobile m2 = new Mobile("Smart phone", "Apple", 52000);
        // Mobile m3 = new Mobile("Smart phone", "Xiaomi", 26000);

        Mobile m1 = new Mobile("Samsung", 55000);
        Mobile m2 = new Mobile("Apple", 52000);
        Mobile m3 = new Mobile("Xiaomi", 26000);
   
        System.out.println("List of the mobile as follows:\n");
        m1.show();
        m2.show();
        m3.show();

        Mobile.show1(m3);

        Class.forName("Mobile");
    }
}
