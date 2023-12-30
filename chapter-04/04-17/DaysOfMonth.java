import java.time.Month;
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        System.out.println("Enter a year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("Enter a month: ");
        String month = input.next();
        if(month.length() > 3){System.out.println(month + " is not correct month.");System.exit(0);}
        if(month.charAt(0) > 'a'){System.out.println(month + " is not correct month.");System.exit(0);}
        if(month.equals("Feb")){System.out.println(month + " " + year + " has 28 days");}
        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov")){
            System.out.println(month + " " + year + " has 30 days");
        }else {
            System.out.println(month + " " + year + " has 31 days");
        }

    }
}
