import java.util.Scanner;

public class SumDigitsInteger {
    public static void main(String[] args) {
        System.out.println("Enter a number between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num >= 1000 || num <= 0){
            System.out.println("Incorrect value, program terminated.");
            System.exit(0);
        }
        int sum = 0;
        for(int i=0; i<3;i++){
            sum += num % 10;
            num /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
    }
}
