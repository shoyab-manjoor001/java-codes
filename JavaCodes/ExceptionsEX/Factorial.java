package ExceptionsEX;

import java.io.IOException;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a Positive Integer Value:");
            int x = sc.nextInt();
            if (x < 0) {
                throw new IOException();
            }
            int f = 1;
            while (x > 0) {
                f = f * x;
                x--;
            }
            System.out.println("Factorial :" + f);
        } catch (IOException e) {
            System.out.println("Factorial of -ve number is not possible...");
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println("Something Went Wrong...");
            System.out.println(e.toString());
        }
    }

}
