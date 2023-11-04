import java.util.ArrayList;

public class Warenkorb {
      private ArrayList<Artikel> artikelListe = new ArrayList<Artikel>();

    public void addArtikel(Artikel objekt){
    // Die Objekte werden im Array hinzufuegt.
    artikelListe.add(objekt);
    }

    public void removeArtikel(Artikel Objekt){
        // Die Objekte werden im Array geloescht.
        if (artikelListe.size() <= 1){
            System.err.println("Ihr Warenkorb ist noch leer.");
        }
        boolean control =true;
        int i =0;
        /* Zu überprüfen ob, das Objekt im array ist,
        wenn ja ist, dann wird geloescht.
        */
        while (control || i <= artikelListe.size()){
            if (artikelListe.get(i) == Objekt){
                artikelListe.remove(i);
                control=false;
            }
            i++;
        }
    }
    public void zeigeWarenKorb() {
        double aufrunden = 0.00;
        double finalResult = 0.00;
        // Zu uberprufen, ob es kein leeres Array ist
        if (artikelListe.size() > 0) {
            // Die foreach-Schleife fuehrt von jedem Artikel in artikelListe die Methode getInfo() aus
            for (Artikel i : artikelListe) {
                System.out.println(i.getInfo());
                aufrunden += i.getPreis();
            }

            // Hier wird auf zwei Nachkommastellen gerundet
            finalResult = Math.round(aufrunden * 100.0) / 100.0;
              System.out.println("Gesamtpreis : " + finalResult + " Euro");
        }
        else {
            System.err.println("Ihre Warenkorb ist noch leer ;)");
        }
    }
}
