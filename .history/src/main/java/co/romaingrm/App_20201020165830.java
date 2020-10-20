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

        System.out.println(year);
        boolean leap = false;
        // System.out.println(year);

        if (year % 400 == 0) {
            leap = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            leap = true;
        }

        // System.out.println(year);

        return leap;

    }

    public static void main(String[] args) {
        System.out.println();
    }
}
