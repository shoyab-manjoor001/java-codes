package AbstractEx;

public class AbstactDemo {

    public static void main(String[] args) {
        Animal cat = new Cat("cat");
        cat.getSound();

        cat.run();
        cat.eat();

        //Animal b = new Animal("Lion");
    }
    
}
