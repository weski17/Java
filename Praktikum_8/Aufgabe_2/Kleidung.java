public class Kleidung extends Artikel {
    private String typ;
    private String groesse;
    private  String farbe ;


    // ______Konstruktor_______
    public Kleidung(String newTyp,String newGroesse,String newFarbe ,int newArtikelNummer, double newNettoPreis) {
        super(newArtikelNummer, newNettoPreis);
        this.typ  = newTyp;
        this.groesse = newGroesse;
        this.farbe = newFarbe;
    }
    // Gibt der aufgerundete Bruttopreis zurück.
    public double getPreis(){
        double bruttoPreis;
        double mehrwertSteuer;
        double aufgerundet;

        mehrwertSteuer = (getNettoPreis()/100)*12 ;
        bruttoPreis = getNettoPreis() + mehrwertSteuer;
        aufgerundet = Math.round(bruttoPreis * 100.0) / 100.0;

        return aufgerundet;
    }
    // Gibt die gewuenschte Informationen zurueck.
    public String getInfo() {
        return ("Kleidung - " + typ + ", " + farbe + " (" + groesse + ") : " + getPreis()  + " Euro");
    }
}
