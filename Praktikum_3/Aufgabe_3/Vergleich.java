public class Vergleich {

    // Boolean Methode und zwei arrays als Parameter.
    public static boolean isEqual(int[] a, int[] b) {
        // Die Vier Variablen sind als speicherplatz.
        int counter1 = 0; // Zaehler fuer a Array
        int counter2 = 0;// Zaehler fuer b Array
        int resultA = 0; // fuer Summe alle Elementen fuer a
        int resultB = 0;// fuer Summe alle Elementen fuer b
        boolean control = false;

        // Fallunterscheidung, ob die gleiche laenge haben.
        if (a.length == b.length) {

            for (int i = 0; i < a.length; i++) {
                // Hier werden die Elemente von a zusammenaddiert.
                resultA += a[i];
                // Hier werden die Elemente von b zusammenaddiert.
                resultB += b[i];

                for (int j = 0; j < a.length; j++) {
                    // wenn eine vielfache element in a Array auftritt.
                    if (a[i] == a[j]) {
                        counter1++; // Zaehle um eins erhoehen
                    }
                    // wenn eine vielfache element in b Array auftritt.
                    if (b[i] == b[j]) {
                        counter2++;
                    }
                }
            }
        }
        /*
        Hier wird geprueft, ob die Arrays gleiche laenge
        und gleiche Summe und gleiche wiederholungswert haben
        */
        if (resultA == resultB && counter1 == counter2 && a.length == b.length) {
            control = true;
        } else {
            control = false;
        }

        return control;
    }
}