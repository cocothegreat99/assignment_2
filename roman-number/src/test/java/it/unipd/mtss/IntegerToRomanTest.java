////////////////////////////////////////////////////////////////////
// Hossam Ezzemouri 2079250
// Costanza Gyulai 2076445
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

public class IntegerToRomanTest {

    @Test
    public void testRomanConversionForValidNumbers() {
        //arrange: preparo i numeri da testare e i risultati attesi
        int[] inputNumbers = {1, 4, 9, 10, 20, 40, 90, 100, 400, 500, 900, 1000};
        String[] expectedRoman = {"I", "IV", "IX", "X", "XX", "XL", "XC", "C", "CD", "D", "CM", "M"};

        //act & assert: converto e verifico i risultati per ciascun numero
        for (int i = 0; i < inputNumbers.length; i++) {
            String actualRoman = IntegerToRoman.convert(inputNumbers[i]);
            assertEquals(expectedRoman[i], actualRoman, "La conversione per " + inputNumbers[i] + " è errata");
        }
    }

    @Test
    public void testRomanConversionForInvalidNumbers() {
        //arrange:preparo i numeri non validi da testare
        int[] invalidNumbers = {0, -10};

        //act & assert: verifico che venga restituito l'errore per numeri non validi
        for (int number : invalidNumbers) {
            String actualResult = IntegerToRoman.convert(number);
            assertEquals("Invalid number", actualResult, "La gestione dell'errore per il numero " + number + " è errata");
        }
    }

    @AfterAll
    public static void displayCompletionMessage() {
        //messaggio finale di completamento dei test
        System.out.println("All tests completed successfully. Everything is OK.");
    }
}
