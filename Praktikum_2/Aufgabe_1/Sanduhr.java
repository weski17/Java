class Sanduhr {
    public void printSanduhr(int width) {

        // leere Zeichnungen zaehler erstellt und width als Sterne genannt
        int leer = 0, sterne = width;

        for (int i = 0; i < width; i++) {
            // fuer die Leere Zeichnungen ausdrucken
            for (int j = 0; j < leer; j++) {
                System.out.print(" ");
            }
            // Fallunterscheidung fuer die geraden Zahlen und ungerade Zahlen
            if (width % 2 == 0) { // Gerade Zahlen
                if (sterne <= width) { // control fuer die letzte Zeile
                    // die Sterne werden gezeichnet mit Beruecksichtigung Anzahl der Sterne
                    for (int k = 0; k < sterne; k++) {
                        System.out.print("*");
                    }
                }
            } else { // Fuer die ungeraden Zahlen
                // die Sterne werden gezeichnet mit Beruecksichtigung Anzahl der Sterne
                for (int k = 0; k < sterne; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();

            // Fuer die ungeraden Zahlen
            if (width % 2 == 1) {

                //Ab die Erste Zeilen bis die Mittler Zeile erreicht wird
                if (i < width / 2) {
                    leer++; // Zaehler der leeren Zeichnungen um 1 erhoehren
                    sterne -= 2; // Die Sterne um 2 reduziert
                }
                // Ansonsten wird umgekehrt eingesetzt
                else {
                    leer--; // Zaehler leer um 1 reduziert
                    sterne += 2; // um 2 erhoehrt
                }
            } else { // Fuer die geraden Zahlen
                // bis die Mittler Zeile erreicht wird
                if (i + 1 < width / 2) {
                    leer++;
                    sterne -= 2;
                }
                //Ab die mittlere Zeile
                else {
                    leer--;
                    sterne += 2;
                }
            }
        }
    }
    public static void main(String[] args) {
        // object erstellt und die printSandUhr aufrufen
        Sanduhr main = new Sanduhr();
        main.printSanduhr(6);
    }// main Method Ende
} // Klasse Ende