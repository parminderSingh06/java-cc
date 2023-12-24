import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args){
        //Initializes our input variable that takes in users values.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = input.nextDouble();
        System.out.println("Enter length: ");
        double length = input.nextDouble();
        //Performs calculations using the correct formulas and stores them in variables.
        double area = radius * radius * Math.PI;
        double volume = area * length;
        //Prints out for user to see their answer.
        System.out.println("The area is " + area + "\nThe volume is " + volume);
    }
}
