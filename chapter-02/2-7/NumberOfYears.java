import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        int minutes = input.nextInt();
        int days = minutes/1440;
        int years = minutes/525600;
        int remainingDays = days%365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
    }
}
