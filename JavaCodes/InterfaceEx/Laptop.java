package InterfaceEx;

public class Laptop implements Computer {

    @Override
    public void getSpecifications() {
        System.out.println("8 GB RAM , 512 INTERNAL STORAGE.");
    }

    @Override
    public void code() {
        System.out.println("Code , Compile ,Run..");
    }
}
