public class Tier{


    // Die drei Variablen installieren
    private String name;
    private String frisstfleich = "-";
    private String frisstpflanzen = "-";

    public String getName() { //Get Methode fuer name
        return name;
    }

    public void setName(String name) { //Set Methode fuer name
        this.name = name;
    }

    public void setNahrung(Tier tier) { // Set Methode
        // ein adjektiv zu Name des Tieres geben mithilfe des Objektes
        this.frisstfleich = tier.getName();
    }

    public void setNahrung(Pflanze pflanze) {
        // ein adjektiv zu Name der Pflanze geben mithilfe des Objektes
        this.frisstpflanzen = pflanze.getName();
    }

    public String frissart() {
        // Eine Fallunterscheidung um zuueberpruefen welche art er ist
        if (frisstfleich != "-" && frisstpflanzen != "-") {
            return "Allesfresser";
        } else if (frisstfleich != "-") {
            return "Fleischfresser";
        } else {
            return "Pflanzenfresser";
        }
    }

}
