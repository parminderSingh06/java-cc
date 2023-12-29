import java.util.Scanner;

public class UnicodeCharacter {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        System.out.println("The Unicode for the character " + c + " is " + (int)c);
    }
}
