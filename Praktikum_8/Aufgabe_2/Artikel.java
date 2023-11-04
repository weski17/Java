public class Artikel {
    private int artikelNummer;
    private double nettoPreis;

    // Getter, damit die Unterklassen auf nettoPreis zugreifen koennen.
    public int getArtikelNummer() {

        return artikelNummer;
    }
    // Getter, damit die Unterklassen auf nettoPreis zugreifen koennen.
    public double getNettoPreis() {
        return nettoPreis;
    }
    // ___________Konstruktor___________
    public Artikel(int newArtikelNummer , double newNettoPreis){
        this.artikelNummer = newArtikelNummer;
        this.nettoPreis = newNettoPreis;
    }

    // ruft die beschriebene Methode aus der Unterklasse auf.
    public String getInfo(){
            return this.getInfo();
    }
    // ruft die beschriebene Methode aus der Unterklasse auf.
    public double getPreis(){
        return this.getPreis();
    }


}
