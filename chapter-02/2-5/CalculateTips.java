import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        System.out.println("Enter the subtotal: ");
        Scanner input = new Scanner(System.in);
        double subTotal = input.nextDouble();
        System.out.println("Enter the gratuity rate: ");
        double tip = input.nextInt() * subTotal / 100;
        System.out.println("The gratuity is $" + tip + " and total is $" + (subTotal + tip));
    }
}
