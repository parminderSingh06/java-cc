import java.text.DecimalFormat;
import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        System.out.println("Enter balance and interest rate: ");
        Scanner input = new Scanner(System.in);
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate/1200);
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println("The interest is " + df.format(interest));
    }
}
