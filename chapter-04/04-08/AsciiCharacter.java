import java.util.Scanner;

public class AsciiCharacter {
    public static void main(String[] args) {
        System.out.println("Enter an ASCII code: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("The character ASCII code for " + num + " is " + (char)num);
    }
}
