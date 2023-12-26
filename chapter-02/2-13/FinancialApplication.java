import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args) {
        //Takes user input on how much they plan to invest per month
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        //Performs calculations, could have used a loop to simplify but that will be done in chapter 5 of book
        double monthlyInterest = 1 + 0.00417;
        double totalMoney;
        totalMoney = monthlySaving * monthlyInterest;
        totalMoney = (monthlySaving + totalMoney) * monthlyInterest;
        totalMoney = (monthlySaving + totalMoney) * monthlyInterest;
        totalMoney = (monthlySaving + totalMoney) * monthlyInterest;
        totalMoney = (monthlySaving + totalMoney) * monthlyInterest;
        totalMoney = (monthlySaving + totalMoney) * monthlyInterest;
        totalMoney = Math.round(totalMoney * 100) / 100.00;
        //Prints out account value to console
        System.out.println("After the sixth month, the account value is $" + totalMoney);
    }
}
