public class BioTest {
    public static void main(String[] args) {
        /** Objekt aus Klasse erstelln
         *  und damit die Methode setName rufen und
         *  den eingegebenen name im name speichern
         *  und die Methode setTextuelle aufrufen
         *  die beschreibung hinfuegen
         */

        Pflanze gras = new Pflanze();
        gras.setName("Gras");
        gras.setTextuelle("Gruen");

        Pflanze beeren = new Pflanze();
        beeren.setName("Beeren");
        beeren.setTextuelle("Rot");

        Pflanze algen = new Pflanze();
        algen.setName("Algen");
        algen.setTextuelle("Silber");

        Tier fisch = new Tier();
        fisch.setName("Fisch");
        fisch.setNahrung(algen);

        Tier zebra = new Tier();
        zebra.setName("Zebra");
        zebra.setNahrung(gras);

        Tier loewen = new Tier();
        loewen.setName("Loewe");
        loewen.setNahrung(zebra);

        Tier baeren = new Tier(); // Objekt aus Tier Klasse
        baeren.setName("Baer");   // Baer als Name einsetzen
        baeren.setNahrung(beeren);// ein adjektiv zu Baer hinfuegen
        baeren.setNahrung(fisch); //ein adjektiv zu Baer hinfuegen

        //Ausgaben
        System.out.println(zebra.getName() + " ist ein " + zebra.frissart());
        System.out.println(loewen.getName() + " ist ein " + loewen.frissart());
        System.out.println(baeren.getName() + " ist ein " + baeren.frissart());
    }
}
