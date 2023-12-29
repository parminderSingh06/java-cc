import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        //Gets input from user
        System.out.println("Enter a hex digit: ");
        Scanner input = new Scanner(System.in);
        String hexDigit = input.next();
        //Converts number to hex and makes sure its valid input
        int decVal = Integer.parseInt(hexDigit,16);
        if(decVal < 0 || decVal > 15){
            System.out.println("Error Incorrect input, only 0-15 is allowed.");
            System.exit(0);
        }
        //Convert to binary and print
        System.out.println("The Binary value is " + Integer.toBinaryString(decVal));
    }
}
