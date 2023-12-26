import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //Takes input from user and stores in appropriate variables
        System.out.println("Enter the coordinates of three points separated by spaces: ");
        Scanner input = new Scanner(System.in);
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        //Performs calculations
        double area = x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2);
        area *= 0.5;
        area = Math.abs(area);
        //Prints answer to console
        System.out.println("The area of the triangle is " + area);
    }
}
