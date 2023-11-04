public class BildTest {
    public static void main(String[] args) {
        // Objekt aus der Klasse Bild erstellt.
        Bild bild = new Bild();
        // Zweidimensionalen Array als int.
        int[][] array1 = {
                {0, 0, 1, 1, 0},
                {0, 1, 0, 1, 1},
                {1, 0, 0, 1, 1},
                {0, 1, 0, 1, 0}
        };
        // Die Methoden aus Klasse Bild mithilfe des Objektes aufrufen.
        bild.setOrginal(array1);
        bild.flipAndInvert();
        bild.ausgabe();

    }
}


