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

    public static boolean leapYears(int year) {
        boolean leap=false;

        //System.out.println(year);
        switch (year) {
            case 1:
                if (year % 400 == 0) {
                    leap = true;
                }
                break;

            case 2:
                if (year % 4 == 0 && year % 100 != 0) {
                    leap = true;
                }
                break;

            default: leap = false; 
        }
        
        return leap;
        System.out.println(year);
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
