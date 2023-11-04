public class Bild {
    // Zwei zweidimensionalen Arrays erstellt von Datatype int.
    private int[][] orginal;
    private int[][] newArray;

    public void flipAndInvert() {
        /*
        Array als Speicherplatz erstellt und die laenge eingegeben.
         */
        newArray = new int[orginal.length][orginal[0].length];
        int newZeilencounter = 0; // Wird verwendet fuer Zeilen

        //   Da wird von der letzten Zeile nach erste Zeile gezaehlt.
        for (int zeilen = orginal.length - 1; zeilen >= 0; zeilen--) {
            for (int spalten = 0; spalten < orginal[zeilen].length; spalten++) {
                /*
                Die neuen Elemente in newArray speichern und
                die Positionen feststellen.
                Zeilenzaehler ist da, damit der neue Array von 0 anfaengt und immer um eins erhöht.
                 */
                newArray[newZeilencounter][spalten] = orginal[zeilen][spalten];
            }
            newZeilencounter++;
        }
        // Werden die neue elemente im neuen Array invertiert.
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                // Wenn das Element die Zahl 1 hat, dann wird 0
                if (newArray[i][j] == 1) {
                    newArray[i][j] = 0;
                } else {
                    // Wenn das Element die Zahl 0 hat, dann wird 1
                    newArray[i][j] = 1;
                }
            }
        }

    }

    public void ausgabe() {

        System.out.println("Originalbild:");
        // Werden alle Elemente von Array orginal ausgedruckt.
        for (int zeilen = 0; zeilen < orginal.length; zeilen++) {
            for (int spalten = 0; spalten < orginal[zeilen].length; spalten++) {
                System.out.print(orginal[zeilen][spalten] + "  ");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");
        System.out.println("Bild nach flipAndInvert():");

        // Werden alle Elemente von Array newArray ausgedruckt.
        for (int zeile = 0; zeile < newArray.length; zeile++) {
            for (int spalte = 0; spalte < newArray[zeile].length; spalte++) {
                System.out.print(newArray[zeile][spalte] + "  ");
            }
            System.out.println();
        }

    }
   //___ Setters und Getters ___
    public int[][] getOrginal() {
        return orginal;
    }

    public void setOrginal(int[][] orginal) {
        this.orginal = orginal;
    }

}

