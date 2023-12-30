import java.util.Scanner;

public class NumberCountAvg {
    public static void main(String[] args) {
        //Initialize variables needed to store user entry info
        Scanner input = new Scanner(System.in);
        int negativeNum = 0;
        int positiveNum = 0;
        int sum = 0;
        int num;
        System.out.println("Enter an integer, the input ends if it is 0: ");
        //Loop continues forever unless 0 is entered which breaks out of infinite loop
        while(true){
            num = input.nextInt();
            if (num == 0){break;}
            if(num < 0){negativeNum++;}
            if(num > 0){positiveNum++;}
            sum += num;
        }
        //Prints data of values entered to console
        System.out.println("The number of positives is " + positiveNum);
        System.out.println("The number of negatives is " + negativeNum);
        System.out.println("The total is " + sum);
        System.out.println("The average is " + (sum/(positiveNum + negativeNum)));
    }
}
