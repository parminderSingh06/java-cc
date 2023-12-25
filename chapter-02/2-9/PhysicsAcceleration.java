import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args) {
        //Takes user input and stores in appropriate variables
        System.out.println("Enter v0, v1, and t: ");
        Scanner input = new Scanner(System.in);
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        //Performs simple calculation of acceleration
        double acceleration = (v1 - v0)/t;
        //Prints to console
        System.out.println("The average acceleration is: " + acceleration);
    }
}
