import java.util.Scanner;

public class CalculateEnergy {
    public static void main(String[] args) {
        //Takes input from user and stores in appropriate variables
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of water in kilograms: ");
        double m = input.nextDouble();
        System.out.println("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();
        System.out.println("Enter the final temperature: ");
        double finalTemp = input.nextDouble();
        //Calculates energy needed using formula
        double joules = m * (finalTemp - initialTemp) * 4184;
        //Prints to console
        System.out.println("The energy needed is " + joules);
    }
}
