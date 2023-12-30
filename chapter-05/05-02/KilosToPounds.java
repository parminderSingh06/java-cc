public class KilosToPounds {
    public static void main(String[] args) {
        System.out.println("Kilograms\tPounds");
        for(int i=1;i<200;i++){
            System.out.println(i + "\t\t\t" + Math.round(((double)(i * 2.2))*100.0)/100.0);
        }
    }
}
