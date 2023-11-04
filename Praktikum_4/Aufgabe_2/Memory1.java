public class Memory1 {
    // Ein zweidimensionales array als Speicherplatz erstellt.
    private int[][] spielfeld;

    public int[][] generateField(int n) {
        // Wird laenge des Arrays mit der Abhaengigkeit des parameters festgestellt.
        spielfeld = new int[n][n];

        int addiereZahl = 0;
        int counter = 0;
        int zeilenrandom;
        int spaltenrandom;
        int paarzaehler;
        int size = ((n * n) / 2); // Anzahl der Paaren-Zahlen.
        // Eine Fallunterscheidung fuer ungerade Zahlen und Null.
        if (n == 0 || n % 2 == 1) {
            System.out.println("geben Sie eine gerade Zahl ab 0 ein");
            System.exit(0);
            // Fuer die geraden Zahlen.
        } else {
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[0].length; j++) {

                    paarzaehler = 0;
                   // Eine Fallunterscheidung fuer counter kleiner als size
                    if (counter < size) {
                        /*
                        Es wird wiedergeholt, solange bis die Paar-Zahlen ihre Positionen
                        im Neun Array haben.
                         */
                        while (paarzaehler < 2) {
                            zeilenrandom = (int) (Math.random() * n);
                            spaltenrandom = (int) (Math.random() * n);
                            // Eine Fallunterscheidung fuer leere Postionen.
                            if (spielfeld[zeilenrandom][spaltenrandom] == 0) {
                                // Die Anfang-Zahl 5 wird nach jeden durchlauf um eins erhoeht
                                spielfeld[zeilenrandom][spaltenrandom] = addiereZahl + 5;
                                paarzaehler++; // Der zaelher wird um eins erhoeht
                            } else {
                                continue;
                            }
                        }
                    }
                    addiereZahl++;
                    counter++;
                }
                System.out.println();
            }
        }
        return spielfeld;
    }

    public void ausgabe() {
        // Hier wird das Array ausgedruckt.
        for (int zeile = 0; zeile < spielfeld.length; zeile++) {
            for (int spalte = 0; spalte < spielfeld[zeile].length; spalte++) {
                // Fallunterscheidung Fuer die Einrueckung.
                if (spielfeld[zeile][spalte] < 10) {
                    System.out.print(spielfeld[zeile][spalte] + "   ");
                } else {
                    System.out.print(spielfeld[zeile][spalte] + "  ");
                }
            }
            System.out.println();
        }
    }
}