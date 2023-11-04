public class MyList {
    private int[] array = new int[0];

    //______Getter______
    public int[] getArray() {
        return array;
    }


    public void addToList(int index, int item) {
        // Die Laenge wird mithilfe des arrays +1 bestimmt.
        int[] newArray = new int[array.length + 1];
        if (0 <= index && index <= array.length) {
            newArray[index] = item;
            //Fuer Positionen ueberpruefen.
            for (int i = 0; i < array.length; i++) {

                if (i < index) {
                    newArray[i] = array[i];
                } else {
                    // Index wird nach rechts verschoben.
                    newArray[i + 1] = array[i];
                }
            }
            // Die Laenge von array bestimmen.
            array = new int[newArray.length];

            /* Jedes Einzelelement wird in Array an
             der richtigen Position gespeichert.   */
            for (int i = 0; i < array.length; i++) {
                array[i] = newArray[i];
            }
        } else {
            // Zu klein oder zu gross erfolgt eine Fehlermeldung.
            System.exit(0);
        }
    }


    public void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Das Array ist leer!");
        } else {
            // Das gegebenes Array wird ausgedruckt.
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "  ");
            }
        }
    }

    public void removeFromList(int index) {
        int[] newArray;
        // Zu ueberpruefen, ob Index ueberhaupt geloescht werden darf.
        if (0 <= index && index < array.length) {
            // Die Laenge bestimmen.
            newArray = new int[array.length - 1];
            int counter = 0; // Ein Zaehler.

            for (int i = 0; i < array.length; i++) {
                if (i != index) {
                    /*
                     Hier werden die Elemente in newArray gespeichert.
                     */
                    newArray[counter] = array[i];
                    counter++;//Der Zaehler wird um eins erhoeht.
                } else {
                    continue;
                }
            }
            array = new int[newArray.length];
            /* Jedes Einzelelement wird in dem Array an
             der richtigen Position gespeichert.   */
            for (int i = 0; i < newArray.length; i++) {
                array[i] = newArray[i];
            }
        } else {
            System.exit(0);
        }
    }

    public int removeDuplicates() {
        // Wenn das Array leer ist, dann wird nichts angezeigt.
        if (array == null || array.length == 0) {
            System.exit(0);
        }
        int counter = 0;//Ein Zaehler.

        for (int i = 0 ;i< array.length;i++){
            for (int j = i+1 ; j < array.length; j++){
                if (array[i]==array[j]){
                    removeFromList(j);
                    counter++; //
            }
        }
    }
        return counter;
    }
    public void sortList() {
        //Wenn das Array leer ist, dann wird nichts angezeigt.
        if (array == null || array.length == 0) {
            System.exit(0);
        }
        for (int i = 0; i < array.length ; i++) {
            int minimum = i;
            for (int j = i + 1; j < array.length; j++) {
                //
                if (array[minimum] > array[j]) {
                    // Die kleinste Zahl wird in minimum gespeichert.
                    minimum = j;
                    // Die Zahl and der Postion i wird in temp gespeichert.
                    int temp = array[i];
                    // Die kleinste Zahl wird an der Position i gespeichert.
                    array[i] = array[minimum];
                    //Die Zahl von temp wird an der Position, wo die kleinste Zahl war gespeichert
                    array[minimum] = temp;

                }

            }
        }
    }
    public void kompizahl(int zahl){
        //Wenn das Array leer ist, dann wird nichts angezeigt.
        if (array == null || array.length == 0) {
         System.exit(0);
        }
        int counter = 0 ;
        for (int i = 0; i < array.length ; i++) {
            for (int j = i + 1; j < array.length ; j++) {
                for (int z = j + 1; z < array.length; z++) {
                    // Es wird geprüft, ob die Summe der drei Zahlen gleich die eingegebene Zahl ist.
                    if (array[i] + array[j] + array[z] == zahl) {
                        System.out.println(array[i] +" + "+ array[j] +" + "+ array[z] +" = "+ zahl);
                        counter++;
                    }
                }
            }
        }
        if (counter==0){
            System.out.println("Es wurde kein Kompizahl gefunden");
        }
    }
}