public class Hello
{
    public static void main(String[] args) {
        System.out.println("Inside Hello File..");
        char c='a';
        for(byte i=1;i<=26;i++)
        {
            System.out.println(c++);
        }
        int num = 10_00_000;
        System.out.println(num);

        byte b = 0b1011;
        System.out.println(b);

        byte b2 = 0x1E;
        System.out.println(b2);
    }
}