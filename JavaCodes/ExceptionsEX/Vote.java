package ExceptionsEX;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int a;

        String names[] = { "Adam", "Aman", "Abdul", "Chaman", "Salman", "Savej", "Sharukh" };

        try {
            System.out.println("Enter Your Nationality:");
            s = sc.next();
            if (!s.equalsIgnoreCase("Indian")) {
                throw new ArithmeticException();
            }
            System.out.println("Enter Your Age:");
            a = sc.nextInt();
            if (a < 18) {
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("Enter Your Name:");
            s = sc.next();
            boolean flag = false;
            for (String name : names) {
                if (name.equalsIgnoreCase(s)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Your are eligible to Vote!");
            } else {
                throw new NumberFormatException("unRegistered");
            }

        } catch (ArithmeticException e) {
            System.out.println("NonIndian are not allowed to vote:" + e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are under age to Vote." + e.toString());
        } catch (NumberFormatException e) {
            System.out.println("You are not registered Voter :" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            System.out.println(e.toString());
        }
    }

}
