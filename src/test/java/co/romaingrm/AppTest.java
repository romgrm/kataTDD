package co.romaingrm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    
    public void leapYearsTest() {
        assertEquals(true, App.leapYears(2020)); // On test une insertion, qui doit retourner "true" quand on execute la fonction "leapYears", dans la class "App", avec comme paramètre (2020) 
        assertEquals(false, App.leapYears(2021));
        assertEquals(false, App.leapYears(1989));
    }

    @Test

    public void fooBarQixTest(){
        assertEquals("Foo", App.fooBarQix(3));
        assertEquals("Bar", App.fooBarQix(5));
        assertEquals("BarBar", App.fooBarQix(25));
        assertEquals("QixQix", App.fooBarQix(77));
        assertEquals("", App.fooBarQix(0));
    }
        
    @Test
    public void numberInWords() {
        assertEquals("sept", App.numberInWords(7));
        assertEquals("douze", App.numberInWords(12));
        assertEquals("dix-sept", App.numberInWords(17));
        assertEquals("dix-neuf", App.numberInWords(19));
        assertEquals("soixante-dix", App.numberInWords(70));
        assertEquals("quatre-vingt", App.numberInWords(80));
        assertEquals("quatre-vingt-six", App.numberInWords(86));
    }
    
}
