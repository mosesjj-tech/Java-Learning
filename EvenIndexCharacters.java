import java.util.Scanner;

public class EvenIndexCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        for (int i = 0; i < text.length(); i = i + 2) {
            System.out.println(text.charAt(i));
        }

        input.close();
    }
}