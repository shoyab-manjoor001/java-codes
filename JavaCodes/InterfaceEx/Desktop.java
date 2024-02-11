package InterfaceEx;

public class Desktop implements Computer {

    @Override
    public void getSpecifications() {
        System.out.println("16 GB RAM , 1 TB Storage");
    }

    @Override
    public void code() {
        System.out.println("Code , Compile , Run.. : Faster");
    }
}
