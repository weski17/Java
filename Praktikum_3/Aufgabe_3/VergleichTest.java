public class VergleichTest {
    public static void main(String[] args) {
        // Objekt aus Klasse Vergleich erzeugen.
        Vergleich vergleich = new Vergleich();
        // Die Arrays als int definieren und in a oder b speichern.
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 1, 6, 2};
        /*
        Die Methode isEqual mithilfe des Objektes vergleich
         aufrufen und in ausgabe speichern.
         */
        boolean ausgabe = vergleich.isEqual(a, b);
        System.out.println(ausgabe);
        System.out.println();
        int[] a1 = {3, 5, 1, 3};
        int[] b1 = {1, 5, 3, 3};
        boolean ausgabe1 = vergleich.isEqual(a1, b1);
        System.out.println(ausgabe1);
    }
} // ENDE
