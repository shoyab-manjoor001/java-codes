package CollectionFrameWork;

import java.util.LinkedList;

public class LLDemo {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList<>();
        ll.add("abc..");
        ll.add(30);
        ll.add(null);
        ll.add("def..");
        ll.set(0, "Software");
        ll.addFirst("aaaaaa...");
        System.out.println(ll);
    }
}