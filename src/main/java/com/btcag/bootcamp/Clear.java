package com.btcag.bootcamp;

public class Clear {
    public static void clear() {
        int i = 0;
        //"Clear"-Effekt, indem 50 Felder nach unten verschoben wird
        while (i < 50) {
            System.out.println();
            i++;
        }
    }
}
