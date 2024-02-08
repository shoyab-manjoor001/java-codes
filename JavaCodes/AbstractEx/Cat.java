package AbstractEx;

public class Cat extends Animal {

    
    
    public Cat(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void getSound() {
        System.out.println("Cat sounds: meew... ");
    }
    
}
