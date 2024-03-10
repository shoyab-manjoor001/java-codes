
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

    public static void main(String[] args) {

        Vector v = new Vector<>();
        for (int i = 1; i <= v.capacity(); i++) {
            v.addElement(i);
        }
        System.out.println("Original Vector: " + v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            Integer i = (Integer) e.nextElement();
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println(v);
    }
}
