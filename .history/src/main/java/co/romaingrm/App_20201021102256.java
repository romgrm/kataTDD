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

    public static boolean leapYears(int year) { // le int year sera notre paramètre ou les années seront intégrées

        boolean leap = false; // on créer une boolean avec comme valeur par défaut "false" (obligatoire de
                              // définir la variable)

        if (year % 400 == 0) {
            leap = true;
            // 2 conditions pour vérifier si notre année (entrée dans le paramètre "year")
            // est bissextile
        } else if (year % 4 == 0 && year % 100 != 0) {
            leap = true;
        }

        return leap;

    }

    public static int fooBarQix(int number) {

        switch (number) {
            case 1:
                number = 1;
                break;
            case 2:
                number = 2;
                break; 
 
        }

        return number; 


        // String newString = "";
        // int newNumber = 0;

        // if(number == 1 || number == 2){
        // newNumber = number;
        // }else if(number == 3){
        // newString = "FooFoo";

        // }
        // return newNumber;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
