package AbstractEx;

abstract public class Animal
{
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }

    abstract public void getSound();

    public void run()
    {
        System.out.println("Running......");
    }

    public void eat()
    {
        System.out.println("Eating food....");
    }
}
