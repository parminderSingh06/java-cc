import java.util.Scanner;

public class PoundsToKilos {
    public static void main(String[] args) {
        //Asks user to input pounds and stores in lbs variable
        System.out.println("Enter a number in pounds: ");
        Scanner input = new Scanner(System.in);
        double lbs = input.nextDouble();
        //Prints out kilograms to console with simple multiplication
        System.out.println(lbs + " pounds is " + (lbs * 0.454) + " kilograms.");
    }
}
