
public class PassworGenerator {
    private String finalPassword = "";
    //______________Getter______________
    public String getFinalPassword() {
        return finalPassword;
    }

    public void erstellePasswort(String passwort) {

        int counterBig_or_Small = 0;
        int counter_j = 0;
        char firstletter ;
        //Die Methode "split" zerlegt eine Zeichenkette in Teilstrings.
        String[] newarray = passwort.split(" +");
        if (passwort.length() == 0){
            System.err.println("Keine Gueltige Eingabe");
            System.exit(0);
        }
        if (newarray.length == 0 ){
            System.err.println("Keine Gueltige Eingabe");
            System.exit(0);
        }


        for (int i = 0; i < newarray.length; i++) {
            for (int j = 0; j < newarray[i].length(); j++) {

                firstletter = newarray[i].charAt(j);
                /*
                 Es wird ueberprueft, ob der erste Buchstabe ein Alphabet
                 ist und der Zaehler fuer j ein null ist.
                 Der Zaehler fuer j ist da, um nur ein Buchstabe von
                 jedem Wort zu speichern und gleichzeitig wird der Grösster Buchstabe sein
                 */
                if (Character.isAlphabetic(firstletter) && counter_j == 0) {
                    counter_j++;
                    // Zwischen_speicher ist, um char zu string umzuwandeln.
                    String zwischen_Speicher = "";
                    if (counterBig_or_Small == 0) {
                        // Der Buchstabe wird als kleiner Buchstabe gespeichert.
                        zwischen_Speicher = zwischen_Speicher + newarray[i].charAt(j);
                        finalPassword = finalPassword +(zwischen_Speicher.toLowerCase());
                        counterBig_or_Small++;
                    } else {
                        // Der Buchstabe wird als Grosser Buchstabe gespeichert.
                        zwischen_Speicher = zwischen_Speicher + newarray[i].charAt(j);
                        finalPassword = finalPassword +(zwischen_Speicher.toUpperCase());
                        counterBig_or_Small = 0;
                    }
                }
            }
            counter_j = 0;
        }
    }
    public void print() {
        //Hier wird das Password ausgegeben.
        System.out.println("Ergebnis = "+ finalPassword);
    }
}

