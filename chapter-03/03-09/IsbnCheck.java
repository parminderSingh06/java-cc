import java.util.Scanner;

public class IsbnCheck {
    public static void main(String[] args) {
        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        Scanner input = new Scanner(System.in);
        String numAsString = input.next();
        char[] a = numAsString.toCharArray();
        int ans = (Character.getNumericValue(a[0]) +
                Character.getNumericValue(a[1]) * 2 +
                Character.getNumericValue(a[2]) * 3 +
                Character.getNumericValue(a[3]) * 4 +
                Character.getNumericValue(a[4]) * 5 +
                Character.getNumericValue(a[5]) * 6 +
                Character.getNumericValue(a[6]) * 7 +
                Character.getNumericValue(a[7]) * 8 +
                Character.getNumericValue(a[8]) * 9) % 11;
        if(ans == 10){
            System.out.println("The ISBN-10 number is " + numAsString + "X");
        }else
            System.out.println("The ISBN-10 number is " + numAsString + ans);
    }
}
