enum Status {
    SUCCESS,
    FAILURE,
    NOTFOUND,
    PROCESSING;
}

enum Color {
    RED,
    GREEN,
    BLUE;
}

public class Test {
    // Driver method
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);

        Status s = Status.PROCESSING;
        System.out.println(s);
    }
}