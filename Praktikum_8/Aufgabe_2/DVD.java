public class DVD extends Artikel{
    private String filmtitel;
    private int filmDauer_M;



    private int filmDauer_S;



    public double getFilmDauer_M() {
        return filmDauer_M;
    }
    //___________Konstruktor___________
    public DVD(String newFilmtitel, int newArtikelNummer, double newNettoPreis, int newDauer_M, int filmDauer_s) {
        super(newArtikelNummer, newNettoPreis);
        this.filmtitel = newFilmtitel;
        if (filmDauer_s > 0 && filmDauer_s < 61){
            this.filmDauer_S = filmDauer_s;
        }
        else {
            System.err.println("Geben Sie fuer Sekunden andre Zahl ein");
            System.exit(0);
        }
        if (newDauer_M > 0 && newDauer_M < 61){
            this.filmDauer_M = newDauer_M;
        }
        else {
            System.err.println("Geben Sie fuer Minute andre Zahl ein");
            System.exit(0);
        }

    }
    // Gibt der aufgerundete Bruttopreis zurück.
    public double getPreis(){
        double mehrWertsteuer;
        double bruttoPreis;
        double aufgerundet = 0.0;

        mehrWertsteuer = (getNettoPreis()/100) * 19.00;
        bruttoPreis = getNettoPreis() + mehrWertsteuer;
        aufgerundet = Math.round(bruttoPreis * 100.0) / 100.0;

        return aufgerundet;
    } // Gibt die gewuenschte Informationen zurueck.
    public String getInfo(){
        return ("DVD - Java: Der Film, " + filmtitel + " (" + filmDauer_M +":" + filmDauer_S + ") : " + getPreis() + " Euro");
    }

}
