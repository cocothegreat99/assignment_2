////////////////////////////////////////////////////////////////////
// Hossam Ezzemouri 2079250
// Costanza Gyulai 2076445
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;

public class RomanPrinterTest {

    @Test
    public void testPrintForRomanNumeral1() {
        // arrange: numero da testare
        int input = 1;
        String expectedOutput = 
                "  _____ \n" +
                " |_   _|\n" +
                "   | |  \n" +
                "   | |  \n" +
                "  _| |_ \n" +
                " |_____|\n";

        //act: chiamata al metodo da testare
        String actualOutput = new RomanPrinter().print(input);

        // assert: verifica che l'output sia corretto
        assertEquals(expectedOutput, actualOutput, "Il numero romano per 1 è errato");
    }

    @Test
    public void testPrintForRomanNumeral5() {
        // arrange
        int input = 5;
        String expectedOutput = 
                " __      __\n" +
                " \\ \\    / /\n" +
                "  \\ \\  / / \n" +
                "   \\ \\/ /  \n" +
                "    \\  /   \n" +
                "     \\/    \n";

        // act
        String actualOutput = new RomanPrinter().print(input);

        // assert
        assertEquals(expectedOutput, actualOutput, "Il numero romano per 5 è errato");
    }

    @Test
    public void testPrintForRomanNumeral10() {
        //arrange
        int input = 10;
        String expectedOutput = 
                " __   __\n" +
                " \\ \\ / /\n" +
                "  \\ V / \n" +
                "   > <  \n" +
                "  / . \\ \n" +
                " /_/ \\_\\\n";

        //act
        String actualOutput = new RomanPrinter().print(input);

        // assert
        assertEquals(expectedOutput, actualOutput, "Il numero romano per 10 è errato");
    }

    @Test
    public void testPrintForRomanNumeral50() {
        // arrange
        int input = 50;
        String expectedOutput = 
                "  _      \n" +
                " | |     \n" +
                " | |     \n" +
                " | |     \n" +
                " | |____ \n" +
                " |______|\n";

        // act
        String actualOutput = new RomanPrinter().print(input);

        // assert
        assertEquals(expectedOutput, actualOutput, "Il numero romano per 50 è errato");
    }

    @Test
    public void testPrintForRomanNumeral100() {
        // arrange
        int input = 100;
        String expectedOutput = 
                "   _____ \n" +
                "  / ____|\n" +
                " | |     \n" +
                " | |     \n" +
                " | |____ \n" +
                "  \\_____|\n";

        //act
        String actualOutput = new RomanPrinter().print(input);

        //assert
        assertEquals(expectedOutput, actualOutput, "Il numero romano per 100 è errato");
    }

    @Test
    public void testPrintForRomanNumeral500() {
        // arrange
        int input = 500;
        String expectedOutput = 
                "  _____  \n" +
                " |  __ \\ \n" +
                " | |  | |\n" +
                " | |  | |\n" +
                " | |__| |\n" +
                " |_____/ \n";

        // act
        String actualOutput = new RomanPrinter().print(input);

        // assert
        assertEquals(expectedOutput, actualOutput, "Il numero romano per 500 è errato");
    }

    @Test
    public void testPrintForRomanNumeral1000() {
        // arrange
        int input = 1000;
        String expectedOutput = 
                "  __  __ \n" +
                " |  \\/  |\n" +
                " | \\  / |\n" +
                " | |\\/| |\n" +
                " | |  | |\n" +
                " |_|  |_|\n";

        // act
        String actualOutput = new RomanPrinter().print(input);

        //assert
        assertEquals(expectedOutput, actualOutput, "Il numero romano per 1000 è errato");
    }

    @AfterAll
    public static void displayCompletionMessage() {
        // messaggio finale di completamento dei test
        System.out.println("Tutti i test completati con successo.");
    }
}