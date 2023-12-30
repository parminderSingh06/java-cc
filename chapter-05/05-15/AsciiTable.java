public class AsciiTable {
    public static void main(String[] args) {
        System.out.println("ASCII Table From ! to ~");
        //Simple loop to print the dec after typecasting to char
        for(int i=33;i<127;i++){
           if(i % 10 == 3){
               System.out.print("\n");
           }
           System.out.print((char)i + "   ");
        }
    }
}
