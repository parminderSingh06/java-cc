import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double discriminant = (Math.pow(b,2) - 4*a*c);
        double root1 = ((((-1)*b) + Math.pow(discriminant, 0.5))/(2*a));
        if(discriminant < 0){
            System.out.println("The equation has no real roots");
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: " + root1);
        }else {
            double root2 = ((((-1)*b) - Math.pow(discriminant, 0.5))/(2*a));
            System.out.println("The equation has one root: " + root1 + " and " + root2);
        }
    }
}
