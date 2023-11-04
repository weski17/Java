public class WarenkorbTest {
    public static void main(String[] args) {
        Warenkorb warenkorb = new Warenkorb();
        Artikel b1 = new Buch("Max Mustermann","Java das Buch",2011,20221,35);
        Artikel b2 = new Buch("Max Mustermann","Java das Buch",2021,20221,35);
        Artikel dvd = new DVD("Classic Collection",23,17.79,2,21);
        Artikel kleid = new Kleidung ("T-Shirt","M","Blau",1298,10.00);

        warenkorb.addArtikel(b1);
        warenkorb.addArtikel(b2);
        warenkorb.addArtikel(dvd);
        warenkorb.addArtikel(kleid);
        warenkorb.zeigeWarenKorb();

    }
}
