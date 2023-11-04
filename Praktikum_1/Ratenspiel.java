import java.util.Scanner;   // Die Klasse Scanner wird von Java importiert
public class Ratenspiel {   // Fängt die Klasse an

        public static void main(String[] args) {     // main Methode fängt an
            rateZahl(); // Die Methode rateZahl wird gerufen
        }                                            // main Methode beendet
        static void rateZahl() { // Methode rateZahl erstellen
            int versuche = 0; //Versuchzaehler deklariert und definiert
            int randomZahl = (int) (Math.random() * 101); // Randomzahl als ganzzahliger wird zwichen 0 bis 100 erstellt
            Scanner scan = new Scanner(System.in); //Objeckt von Scanner klasse erstellt
            System.out.println("Geben Sie einen Zahl ein");
            int eingabe = scan.nextInt();// Die Methode nextInt() wird von dem Objekt scan gerufen

            while (true) { //While Schleife erstellt damit die Eingabe ueberprueft wird
                versuche++; //Der Zähler der versuchen wird um 1 erhört
                if (eingabe < randomZahl) { // Wenn der angegebener Zahl kleiner als randomZahl
                    System.out.println("Zahl: " + "<" + eingabe + ">");
                    System.out.println("Zufallszahl ist kleiner!");
                } else if (eingabe > randomZahl) { // Wenn groesser als randomzahl
                    System.out.println("Zahl: " + "<" + eingabe + ">");
                    System.out.println("Zufallszahl ist groesser!");
                } else { // Ansonsten randomzahl getroffen.
                    System.out.println("Geschafft! Zufallszahl war " + randomZahl);
                    System.out.println("Anzahl an Versuchen = " + versuche);
                    break; // Wird das Programm gestoppt und das Spiel beendet
                }
                eingabe = scan.nextInt();//Die Methode nochmal rufen damit man neun zahl eingibt, Falls den Randomzahl nicht traf
            }

        }                      // Methode beendet

    }                           // Klasse Main beendet

