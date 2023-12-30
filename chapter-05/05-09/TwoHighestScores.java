import java.util.Scanner;

public class TwoHighestScores {
    public static void main(String[] args) {
        //Sets up variables and takes user input on number of students
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students that took the exam: ");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter student name: ");
        String currentStudent = input.next();
        String topStudent = currentStudent;
        System.out.println("Enter student score: ");
        double currentScore = input.nextDouble();
        double topScore = currentScore;
        double secondTopScore = 0;
        String secondTopStudent = null;
        //Loop through and replace top student if score is higher
        for(int i=0;i<numberOfStudents-1;i++){
            System.out.println("Enter student name: ");
            currentStudent = input.next();
            System.out.println("Enter student grade: ");
            currentScore = input.nextDouble();

            if(currentScore > topScore){
                topStudent = currentStudent;
                topScore = currentScore;
            }
            if(currentScore < topScore && currentScore > secondTopScore){
                secondTopStudent = currentStudent;
                secondTopScore = currentScore;
            }
        }
        //Print answer to console
        System.out.println("The student with the top score is " + topStudent + " his score is " + topScore);
        System.out.println("The student with the second top score is " + secondTopStudent + " his score is " +
                secondTopScore);
    }
}
