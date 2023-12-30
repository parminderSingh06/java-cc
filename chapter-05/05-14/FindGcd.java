import java.util.Scanner;

public class FindGcd {
    public static void main(String[] args) {
        //Ask user for two integers
        System.out.println("Enter two integers: ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        //Decrement until gcd is found
        for(int minimum = Math.min(n1,n2);minimum>0;minimum--){
            if(n1%minimum == 0){
                if (n2%minimum == 0){
                    System.out.println("The GCD of these two integers is " + minimum);
                    System.exit(0);
                }
            }

        }
    }
}
