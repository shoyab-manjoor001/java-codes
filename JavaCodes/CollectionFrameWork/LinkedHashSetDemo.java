import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet<>();
        set.add("A");
        set.add("B");
        LinkedList l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println("Element in Linked List : " + l);
        set.addAll(l);
        System.out.println("Elements in Linked HashSet : " + set);
        System.out.println(set.add(3));
        System.out.println(set.contains(2));
        System.out.println(set.retainAll(l));
        System.out.println(set);
    }

}
