class Test
{
    public static void main(String[] args) {
        
        // Example 1...

        // String s1 = new String("Abcd");
        // String s2 = new String("abcd");
        // String s3 = "abcd";
        // String s4 = "abcd";

        // System.out.println(s1==s2);
        // System.out.println(s1.equals(s2));
        // System.out.println(s3==s4);
        // System.out.println(s3.equals(s4));
        // System.out.println(s1.concat(" hello.."));

        // Example 2...

        // String s1 = new String("Spring");
        // s1.concat("Fall");
        // String s2 = new String("Winter");
        // System.out.println(s2.concat("summer").hashCode());
        // System.out.println(s1);
        // System.out.println(s2);

        // Example 3..
        String s1 = new String("You cannot change me");
        String s2 = new String("You cannot change me");
        
        System.out.println(s1==s2);

        String s3 = "You cannot change me";
        System.out.println(s2==s3);

        String s4 = "You cannot change me";
        System.out.println(s3==s4);

        String s5 = "You cannot "+"change me";
        System.out.println(s4==s5);

        String s6 = "You cannot ";
        String s7 = s6+"change me";
        System.out.println(s4==s7);

        final String s8 = "You cannot ";
        String s9 = s8+"change me";
        System.out.println(s4==s9);
    }
}