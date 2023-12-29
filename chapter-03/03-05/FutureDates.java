import java.util.Scanner;

public class FutureDates {
    public static void main(String[] args) {
        System.out.println("Enter today's day: ");
        Scanner input = new Scanner(System.in);
        int firstNum = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int secondNum = input.nextInt();
        secondNum = (secondNum + firstNum) % 7;
        String firstDay = "", secondDay = "";

        switch (firstNum) {
            case 0: 
                firstDay = "Sunday";
                break;
            case 1: 
                firstDay = "Monday";
                break;
            case 2: 
                firstDay = "Tuesday";
                break;
            case 3: 
                firstDay = "Wednesday";
                break;
            case 4: 
                firstDay = "Thursday";
                break;
            case 5: 
                firstDay = "Friday";
                break;
            case 6: 
                firstDay = "Saturday";
                break;
        }
        
        switch (secondNum) {
            case 0: 
                secondDay = "Sunday";
                break;
            case 1: 
                secondDay = "Monday";
                break;
            case 2: 
                secondDay = "Tuesday";
                break;
            case 3: 
                secondDay = "Wednesday";
                break;
            case 4: 
                secondDay = "Thursday";
                break;
            case 5: 
                secondDay = "Friday";
                break;
            case 6: 
                secondDay = "Saturday";
                break;
        }
        System.out.println("Today is " + firstDay + " and the future day is " + secondDay);
    }
    
}
