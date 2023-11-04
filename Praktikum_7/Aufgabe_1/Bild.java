import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Bild {
    private String format;
    private int laenge;
    private int breite;
    private int maxHelligkeit ;
    private int[][] arrayBild;

    public void leseBild(String dateiName) {

        // Hier muss der Pfad zum Bild eingegeben werden!
        Path filePath = Paths.get("C:/Users/weskeif/Desktop/Oop/" + dateiName);
        int counter_zahl = 5;
        try {
            // Die Datei wird in "file" als String gespeichert.
            String file = Files.readString(filePath);
            format = file.substring(0, 2);
            // Trennt den String "wo keine Zahl ist."
            String[] newArray_string = file.split("\\D+");
            laenge = Integer.valueOf(newArray_string[3]);
            breite = Integer.valueOf(newArray_string[2]);
            maxHelligkeit = Integer.valueOf(newArray_string[4]);
            arrayBild = new int[laenge][breite];

            for (int i = 0; i < laenge; i++) {
                for (int j = 0; j < breite; j++) {
                     /* Alle Zahlen, die als String gespeichert sind,
                        werden als "int" in der bestimmten Position gespeichert.
                     */
                    arrayBild[i][j] = Integer.valueOf(newArray_string[counter_zahl]);

                    counter_zahl++;
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public void rotiereBild(){
        int counter_breite = breite - 1;
        int newBreite = laenge;
        int newLaenge= breite;
        int [][] rotiereArray;

            rotiereArray = new int[newLaenge][newBreite];

            for (int i = 0 ; i < newLaenge ; i++){
                for (int j = 0 ; j < newBreite ; j++){
                    if (counter_breite >= 0) {
                        // Bild um 90° gegen den Uhrzeigersinn drehen "d.h. nach links".
                        rotiereArray[i][j] = arrayBild[j][counter_breite];
                    }
                }
            counter_breite--;
            }
            // Damit "arrayBild" gleiche laenge wie "rotiereArray" hat.
            arrayBild = new int[newLaenge][newBreite];

            for (int i = 0 ; i < newLaenge; i++){
                for (int j = 0 ; j < newBreite ; j++){
            /* Alle Werte die in "rotiereArray" werden in "arrayBild"
             in der jeweiligen Positionen gespeichert.
             */
                arrayBild[i][j]= rotiereArray[i][j];

                }
            }
            // Die Breite und die Laenge bekommen neue Werte.
            breite = newBreite;
            laenge = newLaenge;
    }
    public void schreibBild(String verzeichnis) throws IOException {
        String text = "";
        /*
        Alle Daten werden in "text" als String gespeichert.
         */
        text += format + "\n";
        text += breite + " " + laenge + "\n";
        text += maxHelligkeit +"\n";
        for (int i = 0 ; i < laenge; i++ ){
            for(int j = 0 ; j < breite ; j++){
                // Fallunterscheidungen fuer richtige Einrueckungen.
                if (arrayBild[i][j] <= 9) {
                     if (j == 0){
                     text += Integer.toString(arrayBild[i][j]);
                     }
                     else{
                     text += "  " +Integer.toString( arrayBild[i][j]);
                   }
                }
                else {
                     if (j == 0){
                     text += Integer.toString(arrayBild[i][j]);
                     }
                     else{
                     text += " " + Integer.toString(arrayBild[i][j]);
                     }
                }
            }
          text += "\n";
        }
        Files.writeString(Path.of("C:/Users/weskeif/Desktop/Oop/Abgaben/OOP-Praktikum-7-/" + verzeichnis ) , text);

    }
}

