
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ALDemo2 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        LinkedList<String> ll = new LinkedList<String>();
        System.out.println(al instanceof Serializable);
        System.out.println(ll instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);
        System.out.println(ll instanceof RandomAccess);
    }
}
