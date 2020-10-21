package co.romaingrm;

import java.util.HashMap;
import java.util.Map;

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










    

    private static Map<Integer, String> divisors = new HashMap<>();
    static {
        divisors.put(3, "Foo");
        divisors.put(5, "Bar");
        divisors.put(7, "Qix");
    }

    public static String fooBarQix(Integer number) {

        String resultat = "";

        for (Integer divisor : divisors.keySet()) {
            if(number % divisor == 0){
                resultat += divisors.get(divisor); 
                ;
            }
        }

        if(resultat.equals("")){
            return number.toString(); 
        }

        return resultat;   
    }





























    public static void main(String[] args) {
        System.out.println();
    }
}
