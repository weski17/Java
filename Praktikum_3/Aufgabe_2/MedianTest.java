public class MedianTest { // Test Klasse
    public static void main(String[] args) {
        // Objekt von MedianClass Klasse erzeugt
        MedianClass media = new MedianClass();
        int[] arrayEx = {12, 16, 2, 63, 55, 8};

        /* Ein Speicherplatz erstellt fuer die
          aufgerufene Zahl mithilfe der Methode
           */
        int ausgabe = media.median(arrayEx);
        // Die aufgerufene Zahl ausdrucken
        System.out.println(ausgabe);
/*
        int [] arrayEx2= {42 ,7 ,543 ,77 ,87 ,876 ,143};
        int ausgabeEx2= media.median(arrayEx2);
        System.out.println(ausgabeEx2);
        */

    }
}
