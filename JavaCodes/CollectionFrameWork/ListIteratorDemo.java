package CollectionFrameWork;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("ABC");
        l.add("DEF");
        l.add("EFG");
        l.add("JKL");
        System.out.println(l);

        ListIterator itr = l.listIterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            if (s.equalsIgnoreCase("efg")) {
                itr.remove();
            } else if (s.equalsIgnoreCase("jkl")) {
                itr.add("mno");
            } else if (s.equalsIgnoreCase("def")) {
                itr.set("xyz");
            }
        }
        System.out.println("After Modification : " + l);
    }
}
