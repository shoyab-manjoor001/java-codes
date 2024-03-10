package CollectionFrameWork;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println("First Stack : " + s);
        System.out.println("Elament present at Top:" + s.peek());
        System.out.println("Offset (position) of A : " + s.search("A"));
        System.out.println(s.capacity());
        Stack s2 = new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        System.out.println("Second Stack: " + s2);

        System.out.println("Combination of both Stacks: " + s.addAll(s2));
        System.out.println(s);
        System.out.println(s.contains(5));
        s.clear();
        System.out.println(s);
    }
}
