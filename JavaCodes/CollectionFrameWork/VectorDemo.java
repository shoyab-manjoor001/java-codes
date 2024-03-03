package CollectionFrameWork;

import java.util.Vector;

public class VectorDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // First Example..
        @SuppressWarnings("rawtypes")
        Vector v = new Vector<>();
        System.out.println(v.capacity());
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement("v");
        System.out.println(v.capacity());
        System.out.println(v);

        // Second Example...
        @SuppressWarnings("rawtypes")
        Vector v2 = new Vector<>(
                12, 5);
        System.out.println(v2.capacity());
        for (int i = 1; i <= 12; i++) {
            v2.addElement(i);
        }
        System.out.println(v2.capacity());
        v2.addElement("v2");
        System.out.println(v2.capacity());
        System.out.println(v2);
    }
}
