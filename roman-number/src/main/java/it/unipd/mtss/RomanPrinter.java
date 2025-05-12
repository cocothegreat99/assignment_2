////////////////////////////////////////////////////////////////////
// Hossam Ezzemouri 2079250
// Costanza Gyulai 2076445
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    /*
     * converte un numero intero in numero romano e restituisce
     * sua rappresentazione in ASCII art.
     * num è u n numero intero non negativo.
     * ritorna una stringa che rappresenta il numero in ASCII art 
     * romano, o "Invalid number" se il numero è fuori dal range.
     */
    public static String print(int num) {
        String roman = IntegerToRoman.convert(num);

        // verifica se la conversione ha restituito un numero romano valido o meno
        if (roman.equals("Invalid number")) {
            return "Invalid number\n";
        }

        return buildAsciiArt(roman);
    }

    // costruisce la rappresentazione ASCII art a partire da una stringa in numeri romani
    private static String buildAsciiArt(String roman) {
        final int height = 6;
        StringBuilder result = new StringBuilder();

        for (int line = 0; line < height; line++) {
            for (char symbol : roman.toCharArray()) {
                result.append(renderSymbolLine(symbol, line));
            }
            result.append("\n");
        }

        return result.toString();
    }

    // restituisce la riga 'line' dell'ASCII art corrispondente al simbolo 'ch'
    private static String renderSymbolLine(char ch, int line) {
        switch (ch) {
            case 'I': return asciiI(line);
            case 'V': return asciiV(line);
            case 'X': return asciiX(line);
            case 'L': return asciiL(line);
            case 'C': return asciiC(line);
            case 'D': return asciiD(line);
            case 'M': return asciiM(line);
            default:  return "";
        }
    }

    private static String asciiI(int l) {
        String[] lines = {
            "  _____ ",
            " |_   _|",
            "   | |  ",
            "   | |  ",
            "  _| |_ ",
            " |_____|"
        };
        return lines[l];
    }

    private static String asciiV(int l) {
        String[] lines = {
            " __      __",
            " \\ \\    / /",
            "  \\ \\  / / ",
            "   \\ \\/ /  ",
            "    \\  /   ",
            "     \\/    "
        };
        return lines[l];
    }

    private static String asciiX(int l) {
        String[] lines = {
            " __   __",
            " \\ \\ / /",
            "  \\ V / ",
            "   > <  ",
            "  / . \\ ",
            " /_/ \\_\\"
        };
        return lines[l];
    }

    private static String asciiL(int l) {
        String[] lines = {
            "  _      ",
            " | |     ",
            " | |     ",
            " | |     ",
            " | |____ ",
            " |______|"
        };
        return lines[l];
    }

    private static String asciiC(int l) {
        String[] lines = {
            "   _____ ",
            "  / ____|",
            " | |     ",
            " | |     ",
            " | |____ ",
            "  \\_____|"
        };
        return lines[l];
    }

    private static String asciiD(int l) {
        String[] lines = {
            "  _____  ",
            " |  __ \\ ",
            " | |  | |",
            " | |  | |",
            " | |__| |",
            " |_____/ "
        };
        return lines[l];
    }

    private static String asciiM(int l) {
        String[] lines = {
            "  __  __ ",
            " |  \\/  |",
            " | \\  / |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|"
        };
        return lines[l];
    }
}