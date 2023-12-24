import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args){
        //After importing Scanner class from java util package we can take input from user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degrees in Celsius: ");
        //Creates variables to store the temperatures for Fahrenheit and Celsius after doing calculations.
        double tempCelsius = input.nextDouble();
        double tempFahrenheit = (9.0/5) * tempCelsius + 32;
        //Prints value out to user
        System.out.println("Celsius: " + tempCelsius + " ||| Fahrenheit: " + tempFahrenheit);
    }
}
