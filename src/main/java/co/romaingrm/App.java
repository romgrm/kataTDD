package co.romaingrm;

import java.io.Console;
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

    
    // ************** LEAP YEARS *******************
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


    // ************** FOOBARQIX *******************
    public static String fooBarQix(int number) {
          
         String result = ""; 

        if (number % 3 == 0 && number > 3 ) {
            result = "FooFoo";
        }else if(number % 5 == 0 && number > 5) {
            result = "BarBar";
        }else if(number % 7 == 0 && number > 7){
            result = "QixQix";
        }else if(number == 0) {
            result = "";
        }else if(number % 3 == 0) {
            result = "Foo";
        }else if(number % 5 == 0) {
            result = "Bar";
        }else if (number % 7 == 0) {
            result = "Qix";
        }
       
        return result;
	}





    // ************** NUMBER IN WORDS *******************
    public static String numberInWords(int number){
       
        String result = "";
        
        // Tableaux de chiffres en lettre 
        String[] unites = {"zero", "un", "deux", "trois", "quatre", "cinq","six", "sept", "huit", "neuf" };
        String[] dizaine = {"dix", "onze", "douze", "treize", "quatorze", "quinze","seize", null, null, null, "vingt"};
        String[] centaine = {null, null, "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "soixante-dix", "quatre-vingt", "Ninety" };
       
        // Conditions unites / dizaine et centaine 
        if(number == 0){
            return "zero"; 
        }else if(number < 10){
            result = unites[number]; // va me chercher mon nbx à l'index (ex : 7 donc cherche dans le tableau l'index 7 et donc me renvoie "sept")
            return result; 
        }else if(number < 20){
            int n = number -10; // ex : 12 -10 = 2 
            result = dizaine[n]; // je vais chercher le string à l'index 2, donc "douze"
            //return result == null ? dizaine[n]+"-" : unites[n];
            if(result == null){
                result = dizaine[0] + "-" + unites[n];   
            }
        }else{
            int n = number % 10; // number modulo de 10 pour avoir l'index 
            return centaine[number/10] + // on recupere l'index dans le tableau 
            (n==0 ? "" : ("-" +numberInWords(n))); // on ajoute le tiret + on reprend le n pour completer si c'est pas 0 (ex: 80 ou 86)
        }
    
        return result;
            
    }
    
}
