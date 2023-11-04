import java.util.Scanner; // Scanner Klasse importieren

public class Wochentag {// Fängt die Klasse an

        public static void berechneWochentag(int d, int m, int y) { // Eine Methode mit 3 Integers erstellt
            if (m == 1 || m == 2) { // Wenn die eingegebene Zahl fuer Monat gleich 1 oder 2
                y--;                // Zähler des Jahres um eins sinken
                m += 12;            // m mit 12 addiert
            }

            int c = y / 100;        // Jahrhundert berechnen und in c gespeichert
            y = y % 100;

            int w = (d + ((26 * (m + 1)) / 10) + (5 * y) / 4 + (c / 4) + ((5 * c) - 1)) % 7; // Der angegebener Formel und als w definiert
            if (w == 0) {                            // Wenn das Ergebnis gleich 0 ist
                System.out.println("Sonntag");        // Ausgabe
            } else if (w == 1) {                      // Wenn das Ergebnis gleich 1 ist
                System.out.println("Montag");         // Ausgabe
            } else if (w == 2) {                      // Wenn das Ergebnis gleich 2 ist
                System.out.println("Dienstag");       // Ausgabe
            } else if (w == 3) {                      // Wenn das Ergebnis gleich 3 ist
                System.out.println("Mittwoch");
            } else if (w == 4) {                      // Wenn das Ergebnis gleich 4 ist
                System.out.println("Donnerstag");
            } else if (w == 5) {                      // Wenn das Ergebnis gleich 5 ist
                System.out.println("Freitag");
            } else if (w == 6) {                      // Wenn das Ergebnis gleich 6 ist
                System.out.println("Samstag");
            }
        }


        public static void main(String[] args) {       //Main Klasse fängt an
            Scanner scanne = new Scanner(System.in);  // Objekt von Scanner Klasse definiert

            int  d = scanne.nextInt();                 // Die Methode nextInt() aus scanne gerufen und als Tag definiert
            while (0 >= d || d >= 32) {               // While-Schleife zu ueberpruefen ob Tag zwischen 1 und 31 ist
                System.out.println("Geben Sie für Tag einen andren Zahl ein");
                d = scanne.nextInt();                 // Weiter Eingabe fuer Tag bis der Zahl stimmt
            }
            int m = scanne.nextInt();                //Eingabe als Monat und in m gespeichert

            while (2 > m || m > 15) {                //While-Schleife zu ueberpruefen, ob Monat zwischen 3 und 14 ist
                System.out.println("Geben Sie für Monat einen andren Zahl ein");
                m = scanne.nextInt();
            }

            int y = scanne.nextInt();                 // //Eingabe als Jahr und in y gespeichert


            berechneWochentag(d,m,y);                 // Die berechneWochentag rufen
        }                                             // main Methode endet
}
