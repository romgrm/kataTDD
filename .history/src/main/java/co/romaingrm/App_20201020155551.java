package co.romaingrm;

/**
 * Hello world!
 */
public class App {
    private App() {
    }
    /**
     * @param args The arguments of the program.
     */


    public static boolean leapYears(int year){
        boolean leap; 
        
        switch(year){
            case 1: if(year%400==0){
                    leap=true; 
                    return leap;     
            }break;
            
            case 2: if(year%4 == 0 && year%100 != 0){
                leap = true; 
                return leap
            }


        }

        
        
    }

    
    public static void main(String[] args) {
        //System.out.println("Hello World!");
    }
}
