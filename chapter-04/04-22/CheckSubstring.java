import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        //Take input from user
        System.out.println("Enter string s1: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        System.out.println("Enter string s2: ");
        String s2 = input.next();
        input.close();
        //Checks in it is substring and prints to console
        if(s1.contains(s2)){
            System.out.println(s2 + " is a substring of " + s1);
        }
        else{
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }
}
