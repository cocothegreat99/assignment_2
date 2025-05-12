////////////////////////////////////////////////////////////////////
// Hossam Ezzemouri 2079250
// Costanza Gyulai 2076445
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman {

    //metodo di supporto per aggiungere una combinazione di due caratteri
    private static int appendPair(char first, char second, int index, char[] buffer) {
        buffer[index++] = first;
        buffer[index++] = second;
        return index;
    }

    //per aggiungere più volte lo stesso carattere
    private static int appendMultiple(char symbol, int count, int index, char[] buffer) {
        for (int k = 0; k < count; k++) {
            buffer[index++] = symbol;
        }
        return index;
    }

    //conversione da intero a romano
    public static String convert(int value) {
        if (value <= 0 || value > 1000) {
            return "Invalid number"; //numeri fuori dal range sono invalidi
        }

        char[] result = new char[10001];
        int idx = 0;

        //migliaia
        int thousands = value / 1000;
        if (thousands > 0) {
            idx = appendMultiple('M', thousands, idx, result);
            value %= 1000;
        }

        //centinaia 
        if (value >= 900) {
            idx = appendPair('C', 'M', idx, result);
            value -= 900;
        } else if (value >= 500) {
            idx = appendMultiple('D', value / 500, idx, result);
            value %= 500;
        }

        //centinaia 
        if (value >= 400) {
            idx = appendPair('C', 'D', idx, result);
            value -= 400;
        } else if (value >= 100) {
            idx = appendMultiple('C', value / 100, idx, result);
            value %= 100;
        }

        //Decine
        if (value >= 90) {
            idx = appendPair('X', 'C', idx, result);
            value -= 90;
        } else if (value >= 50) {
            idx = appendMultiple('L', value / 50, idx, result);
            value %= 50;
        }

        //decine
        if (value >= 40) {
            idx = appendPair('X', 'L', idx, result);
            value -= 40;
        } else if (value >= 10) {
            idx = appendMultiple('X', value / 10, idx, result);
            value %= 10;
        }

        //unità alte (9 e 5-8)
        if (value == 9) {
            idx = appendPair('I', 'X', idx, result);
            value = 0;
        } else if (value >= 5) {
            idx = appendMultiple('V', value / 5, idx, result);
            value %= 5;
        }

        //unità basse (4 e 1-3)
        if (value == 4) {
            idx = appendPair('I', 'V', idx, result);
        } else if (value > 0) {
            idx = appendMultiple('I', value, idx, result);
        }

        return new String(result, 0, idx);
    }
}
