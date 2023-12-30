public class GeneratePlateNumber {
    public static void main(String[] args) {
        //Gets random numbers from ASCII table 65-90
        char one = (char)(65 + (int)(Math.random() * 26));
        char two = (char)(65 + (int)(Math.random() * 26));
        char three = (char)(65 + (int)(Math.random() * 26));
        char four = (char)(65 + (int)(Math.random() * 26));
        //Prints to user after concatenating variable's together
        System.out.println("Random number plate is: " + one + two + three + four + (int)(Math.random()*10) +
                (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10));
    }
}
