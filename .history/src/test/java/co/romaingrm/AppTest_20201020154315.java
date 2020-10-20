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
        assertEquals(true, App.leapYears(2020));
    }
}
