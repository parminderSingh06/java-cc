public class ComputeFutureFinance {
    public static void main(String[] args) {
        //Initialize necessary variables
        int tuition = 10000;
        int costTuition = 0;
        //Perform increase then start adding after 10 years have passed
        for(int i=0; i<15;i++) {
            tuition += (int)(tuition * 0.05);
            if(i > 10){
                costTuition += tuition;
            }
        }
        //Print answer to console
        System.out.println("Your total tuition for 4 years, starting after the 10 year is " + costTuition);
    }
}
