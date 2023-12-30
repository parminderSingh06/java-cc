import java.util.Scanner;

public class OrderThreeCities {
    public static void main(String[] args) {
        //Takes input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter second city: ");
        String city2 = input.nextLine();
        System.out.println("Enter third city: ");
        String city3 = input.nextLine();
        input.close();
        //Compares cities against each other and orders them
        String tempCity = "";
        if(city3.compareTo(city2) < 0){
            tempCity = city2;
            city2 = city3;
            city3 = tempCity;
        }
        if(city2.compareTo(city1) < 0){
            tempCity = city1;
            city1 = city2;
            city2 = tempCity;
        }
        if(city3.compareTo(city2) < 0){
            tempCity = city2;
            city2 = city3;
            city3 = tempCity;
        }
        //Prints answer out to the console
        System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
    }
}
