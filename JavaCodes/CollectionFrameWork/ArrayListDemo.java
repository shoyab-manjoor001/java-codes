
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList obj = new ArrayList<>();
        obj.add("A");
        obj.add(10);
        obj.add("A");
        obj.add(null);
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);
        obj.add(2, "M");
        System.out.println(obj);
        obj.add("N");
        System.out.println(obj);
    }
}
