public class Buch extends Artikel{
    private String buchtitel;
    private int erscheinungsJahr;
    private String autornamen;
    //__________Konstruktor_________
    public Buch(String newAutornamen,String newBuchtitel, int newErscheinungsJahr
            ,int newArtikelNummer, double newNettoPreis) {

        super(newArtikelNummer, newNettoPreis);
        this.autornamen = newAutornamen;
        this.buchtitel = newBuchtitel;
        this.erscheinungsJahr = newErscheinungsJahr;

    }
    // Gibt die gewuenschte Informationen zurueck.
    public String getInfo(){
        return ("Buch "+"- "+ autornamen+", "+ buchtitel+" ("+ erscheinungsJahr+")"+" : "+ getPreis()+" Euro");
    }
    // Gibt der aufgerundete Bruttopreis zurück.
    public double getPreis(){
        double mehrwertsteuer;
        double aufgerundet ;
        double bruttoPreis;

        mehrwertsteuer = (getNettoPreis() /100 ) * 7;
        bruttoPreis = getNettoPreis() + mehrwertsteuer;
        aufgerundet = Math.round( bruttoPreis * 100.0) / 100.0;

        return aufgerundet;
    }
}
