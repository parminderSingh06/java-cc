import java.util.Scanner;

public class CheckSSN {
    public static void main(String[] args) {
        //takes input from user
        System.out.println("Enter a SSN: ");
        Scanner input = new Scanner(System.in);
        String ssn = input.next();
        input.close();
        //does checks to see if dashes are placed correctly
        if (ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
            System.out.println("Invalid ssn!");
            System.exit(0);
        }
        if (ssn.length() != 11) {
            System.out.println("Invalid ssn!");
            System.exit(0);
        }
        //prints answer to console
        System.out.println(ssn + " is a valid ssn.");
    }
}
