package StringBuffer;

public class DemoSB 
{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        System.out.println(sb.length());
        sb.append("q");
        System.out.println(sb.capacity());
        sb.append("abcdefghijklmnop");
        sb.append("q");
        sb.append("rfe");
        System.out.println(sb.capacity());
        System.out.println(sb);
    }
}
