import java.util.Scanner;

public class ISBNValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 13-digit ISBN: ");
        String isbn = input.nextLine();

        if (isbn.length() != 13) {
            System.out.println("Invalid ISBN.");
            input.close();
            return;
        }

        boolean validDigits = true;

        for (int i = 0; i < isbn.length(); i++) {
            char digit = isbn.charAt(i);

            if (digit < '0' || digit > '9') {
                validDigits = false;
            }
        }

        if (!validDigits) {
            System.out.println("Invalid ISBN. Use digits only.");
            input.close();
            return;
        }

        int total = 0;

        for (int i = 0; i < 12; i++) {
            int digit = isbn.charAt(i) - '0';

            if (i % 2 == 0) {
                total = total + digit;
            } else {
                total = total + digit * 3;
            }
        }

        int checkDigit = (10 - (total % 10)) % 10;

        if (checkDigit == isbn.charAt(12) - '0') {
            System.out.println("Valid ISBN-13.");
        } else {
            System.out.println("Invalid ISBN-13.");
        }

        input.close();
    }
}