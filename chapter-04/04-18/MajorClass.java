import java.util.Scanner;

public class MajorClass {
    public static void main(String[] args) {
        System.out.println("Enter two characters: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String ans = "";
        switch (word.charAt(0)){
            case 'M':
                ans += "Mathematics";
                break;
            case 'C':
                ans += "Computer Science";
                break;
            case 'I':
                ans += "Information Technology";
                break;
        }
        switch (word.charAt(1)){
            case '1':
                ans += " Freshman";
                break;
            case '2':
                ans += " Sophomore";
                break;
            case '3':
                ans += " Junior";
                break;
            case '4':
                ans += " Senior";
                break;
        }
        System.out.println(ans);
    }
}
