import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet h = new HashSet<>();
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add(null);
        h.add(1.0);
        System.out.println(h.add("B"));
        System.out.println(h);
        Iterator itr = h.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Integer a[] = { 1, 2, 3, 4, 5 };
        List<Integer> list = Arrays.asList(a);
        h.addAll(list);

        System.out.println(h);
        HashSet h2 = (HashSet) h.clone();

        System.out.println("Clone of Hashset h : " + h2);
        for (Object h22 : h2) {
            System.out.println(h22);
        }

        System.out.println(h.contains(1));
        System.out.println(h.getClass().getName());
        System.out.println(h.hashCode());
        System.out.println(h.isEmpty());
        System.out.println(h2.isEmpty());
    }
}