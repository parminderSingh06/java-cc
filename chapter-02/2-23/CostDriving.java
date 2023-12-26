import java.text.DecimalFormat;
import java.util.Scanner;

public class CostDriving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the driving distance: ");
        double drivingDistance = input.nextDouble();
        System.out.println("Enter miles per gallon:");
        double mpg = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        double ppg = input.nextDouble();

        double costOfDriving = (drivingDistance/mpg) * ppg;
        DecimalFormat df = new DecimalFormat(".##");

        System.out.println("The cost of driving is $" + df.format(costOfDriving));
    }
}
