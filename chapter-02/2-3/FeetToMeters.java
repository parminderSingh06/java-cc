import java.util.Scanner;

public class FeetToMeters {
    public static void main(String[] args) {
        //Asks user for input of feet and stores in double variable
        System.out.println("Enter a value for feet: ");
        Scanner input = new Scanner(System.in);
        double ft = input.nextDouble();
        //Calculates the meters and prints out to the console
        System.out.println(ft + " feet is " + (ft * 0.305) + " meters.");
    }
}

