package co.romaingrm;

/**
 * Hello world!
 */
public class App {
   
    public static boolean leapYears(int year){
        boolean leap;  

        if(year%400==0){
            leap=true; 
        }
        return leap; 
    }

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");
    }
}
