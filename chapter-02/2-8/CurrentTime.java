import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        //Asks user for input of GMT offset and stores it in a variable
        System.out.println("Enter the time zone offset to GMT: ");
        Scanner input = new Scanner(System.in);
        int offset = input.nextInt();
        //Obtains current time using System function and performs conversions to get hours, minutes, and seconds
        long totalMilliseconds = System.currentTimeMillis();

        long totalSeconds = totalMilliseconds/ 60;

        long currentSeconds = totalSeconds%60;

        long totalMinutes = totalSeconds/60;

        long currentMinutes = totalMinutes%60;

        long totalHours = totalMinutes/60;

        long currentHour = totalHours%24;
        //Add the offset to the current hour and thus obtain the time
        currentHour += offset;
        //Print time with offset to console
        System.out.println("The current time is " + currentHour + ":" + currentMinutes + ":" + currentSeconds);
    }
}
