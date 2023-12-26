import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BmiComputation {
    public static void main(String[] args) {
        //Asks user for input and stores in appropriate variables and converts them to different scales
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();
        weight *= 0.45359237;
        System.out.println("Enter height in inches: ");
        double height = input.nextDouble();
        height *= 0.0254;
        //Calculates BMI
        double bmi = weight/(height * height);
        //Converts long decimal number to simple one
        DecimalFormat df = new DecimalFormat("#.####");
        df.setRoundingMode(RoundingMode.CEILING);
        //Prints bmi to console
        System.out.println("BMI is " + df.format(bmi));
    }
}
