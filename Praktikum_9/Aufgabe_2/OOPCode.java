import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;


public class OOPCode {

    private int n;
    private int summe = 0;
    private int[][] array_potenz;
    private int[][] code = new int[n][n];
    private int[][] ausgabe;
    private ArrayList<Integer> store = new ArrayList<>();


    // ______Konstruktor-------
    public OOPCode(int n, int[][] newOne) {

        if (n > 0) {
            this.n = n;
        } else {
            System.err.println("Geben Sie eine Zahl, die greoesser als 0 ist.");
            System.exit(0);
        }
        if (newOne == null || newOne.length == 0) {
            System.err.println("Geben Sie ein Array ein");
            System.exit(1);
        }
        if (newOne.length == newOne[0].length) {
            this.code = newOne;
            array_potenz = new int[n][n];
        } else {
            System.err.println("Geben Sie ein n*n Array ein");
        }
    }

    // Rekursive Funktion
    public int rek(int k) {
        if (k == 0) {
            return 1;
        } else {
            return (2 * (rek(k - 1)));
        }
    }

    public void zahlenpotenz() {
        int zaehler = -1;
        System.out.println("Anzahl : " + n);
        for (int i = 0; i < array_potenz.length; i++) {
            for (int j = 0; j < array_potenz[i].length; j++) {
                array_potenz[i][j] = rek((n * n) + (zaehler));
                System.out.print(" " + array_potenz[i][j] + " ");
                zaehler--;
            }
            System.out.println();
        }
    }

    public int berechne() {
        int result = 0;
        store.clear();
        //Berechnet den Standort OOPCode.
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < code[i].length; j++) {
                if (code[i][j] == 1) {
                    store.add(array_potenz[i][j]);
                }
            }
        }
        for (int i : store) {
            result += i;
        }
        return result;
    }

    public void drehen90() {
        // Das Bild wird damit um 90 im Uhrzeigersinn gedreht.
        int[][] rotated = new int[n][n];
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < code[i].length; j++) {
                rotated[j][code.length - i - 1] = code[i][j];
            }
        }
        // Das rotiertes Bild wird im Array "Code" gespeichert.
        for (int i = 0; i < code.length; i++) {
            for (int j = 0; j < code[i].length; j++) {
                code[i][j] = rotated[i][j];
            }
        }
    }

    public void groessten() throws IOException {
        String bild = "";
        int wert = 0;
        ausgabe = new int[n][n];
        boolean startRotation = false;
        int result = 0;
        int rotation = 0;
        //fuere diesen Code aus, bis das Bild einmal um 360 grad gedreht wurde

        for (int i = 0; i < 4; i++) {
            store.clear();
            int summe_store = 0;
            // Wird nach dem ersten Mal gedreht.
            if (startRotation) {
                drehen90();
            }
            startRotation = true;
            // Ergebnis der Methode "berechne" wird in der Variable "method" gespeichert.
         int method = berechne();
            //Vergleichen, groestes Ergebnis und Rotation filtern
            if (summe < method) {
                // Die Elemente, die mit dem groessten Wert werden im Array "ausgabe" gespeichert.
              for (int w = 0 ; w < code.length; w++){
                  for (int z = 0 ; z < code[0].length ; z++){
                          ausgabe[w][z] = code[w][z];
                  }
              }
              summe = method;
              wert = summe;
              rotation++;
            }
        }
        // Das Array "ausgabe" wird ausgedruckt.
        for (int i = 0 ; i < ausgabe.length; i++ ){
            for (int j = 0 ; j < ausgabe[0].length; j++){
                bild += " "+Integer.toString(ausgabe[i][j]);
                System.out.print(ausgabe[i][j]+" ");
            }
            bild+= "\n";
            System.out.println();
        }
        System.out.println("Anzahl der Rotationen = "+rotation);
        System.out.println("Wert des OOPCodes : "+ wert);
        Files.writeString(Path.of("C:\\Users\\weskeif\\Desktop\\Oop\\Abgaben\\OOP-Praktikum-9-\\Auf2\\bild1"),bild);
    }
}
