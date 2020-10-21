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
        //assertEquals(1, App.fooBarQix(1));
        //assertEquals(2, App.fooBarQix(2));
        assertEquals("FooFoo", App.fooBarQix(3));
        assertEquals("BarBar", App.fooBarQix(5));
    }
        @Test

        public void fooBarQixTest2(){
            assertEquals(1, App.fooBarQix(1));
            //assertEquals(2, App.fooBarQix(2));
            //assertEquals("FooFoo", App.fooBarQix(3));
    }
}
