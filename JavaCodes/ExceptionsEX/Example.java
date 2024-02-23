package ExceptionsEX;

public class Example {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        // int result = 0;
        try {
            // result = a / b;
            System.out.println("Result : " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Please Don't divide by zero  :" + e);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
        // System.out.println("Result:" + result);
        System.out.println("End of program....");
    }
}
