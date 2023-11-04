import java.util.Arrays;
public class MedianClass {

    // Methode median und rueckgabe als int
    public static int median(int[] array) {
        //Ein Speicherplatz
        int mittel = 0;
        // Wird das Array sortiert
        Arrays.sort(array);

        // Fallunterscheidung zwischen Gerade und ungerade Mengenanzahl
        if (array.length % 2 == 0) {
            // Wird die Formel verwendet und die mittlere Zahl in mittel gespeichert.
            mittel = (array[array.length/2-1]+array[array.length/2])/2;
        } else {
             mittel = array[(array.length/2)];
        }
        // Die getroffene mittel Zahl wird aufgerufen.
        return mittel;

    }// Methode Ende
}//Class Ende





