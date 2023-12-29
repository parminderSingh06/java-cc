import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        System.out.println("Enter a decimal value(0 to 15): ");
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();
        //Check if value is in constraints of input
        if(decimal < 0 || decimal > 15){
            System.out.println("Error Incorrect input, only 0-15 is allowed.");
            System.exit(0);
        }
        //print number as is if less than 10 otherwise do simple operation to convert
        if(decimal < 10) {
            System.out.println("The Hex value is " + decimal);
        }else
            System.out.println("The Hex value is " + (char)('A' + decimal - 10));
    }
}
