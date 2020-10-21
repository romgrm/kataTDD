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

        // String newString = "";
         //int newNumber = 0;
         String allByTrois = "FooFoo"; 
         //String justByTrois = "Foo";

         if(number%3 == 0 && number == 3){
             //number = Integer.parseInt(divisibleByTrois + trois); 
             //divisibleByTrois = Integer.toString(number);
             number = Integer.parseInt(allByTrois); 
        }
        return number; 
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
