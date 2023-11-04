import java.util.Scanner;  // Die Scanner Klasse von Java importieren
public class Sensordaten {
        static void filterMesswerte() {
            Scanner nummer = new Scanner(System.in);
            int ausgabe;     // Die Ausgabe definieren.
            int count_0 = 0; // Der Zähler für Nullen 0 definieren und deklarieren.
            int count_1 = 0; // Der Zähler für Einsen definieren und deklarieren.
            System.out.println("Geben Sie einen Zahl ein");
            while (true) { // Die Eingabe wird überprüfen und bearbeitet, bis break vorkommt
                int eingabe = nummer.nextInt(); // Der Zahl wird eingegeben
                System.out.println("Eingabe = " + eingabe);
                if (eingabe < 0) { // Für Negative Zahlen gilt
                    count_1 = 0;   // Der Einsen Zähler wird wieder auf null eingesetzt
                    ausgabe = eingabe * (-1); // der Betrag des Wertes gebildet und in ausgabe speichern
                    System.out.println("Output = " + ausgabe);
                } else if (eingabe == 0) {    // Für die Eingabe Null
                    count_1 = 0;
                    if (count_0 < 1) { //wenn der Zähler für Nullen kleiner als 1
                        count_0++;     // Zähler von nullen um eins erhören
                        ausgabe = eingabe; // Die Eingabe soll bei Ausgabe ausgedrückt
                        System.out.println("Ausgabe = " + ausgabe);
                    } else {               // Ansonsten
                        System.out.println("Ausgabe = ");
                    }
                } else if (eingabe == 1) { // Wenn die Eingabe ist 1
                    if (count_1 < 2) {     //
                        count_1++;
                        System.out.println("Output = ");
                    } else {
                        System.out.println("Output = ");
                        System.out.println("Programm stop");
                        break;              // Stoppt das Programm
                    }
                } else {
                    count_1 = 0;
                    System.out.println("Output = ");
                }
            }
        }

        public static void main(String[] args) {
            filterMesswerte(); // Die filterMesswerte Methode rufen
        }
    }


