package ExceptionsEX;

class CustomException extends Exception {
    public CustomException(String msg) {
        super(msg);
    }
}

public class Demo {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;
        try {
            j = 12 / i;
            if (j == 0) {
                throw new CustomException("Inside Custom Exception...");
            } else {
                System.out.println("Outside Custom Exception");
            }
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

}
