

public class TemperaturGraph {
    private Integer [] array = new Integer[12];
    private int Jahr;
    int counter ;
    public TemperaturGraph(int Jahr){
        this.Jahr = Jahr;
    }

    public void addTemperatur(int monat,int temperatur){

        // Hier wird der wert der Temperaturen geprueft.

        if (temperatur>=0) {
            // Monate in Indizes umgewandelt.
           monat = monat - 1;
           array[monat] = temperatur;
           counter++;
       }
       else {
           System.err.println("Der Temperaturwert vom Monat "+monat+" soll 0 oder groesser sein" );
            System.exit(0);
       }
     }
    public void plotGraph(){
        // Zu ueberpruefen, ob alle Monate eingegeben wurden.
            if (counter!=12){
                System.err.println("Anzahl der Monate, ist nicht vollstaendig");
                System.exit(0);
            }
        // ueberpruefen, ob jeder Monat einen Wert hat.
        for (int i = 0 ; i < array.length; i++){
            if (array[i] == null){
                System.err.println("Geben Sie beim "+array[i]+". Monat einen Wert ein. ");
                System.exit(0);
        }
        }
        int maximum = array[0];
        int minimum= array[0];
        //  feststellen, wie gross minimum und maximum sind.
        for (int i = 0 ; i < array.length; i++){
            if (minimum > array[i]){
                minimum = array[i];
            }
            if (maximum < array[i]){
                maximum = array[i];
            }
        }
        System.out.print("Jahr: "+ Jahr);
        System.out.println();
        for (int i = maximum ; maximum >= minimum; maximum--){
            System.out.print(maximum+"  ");
            for (int j = 0 ; j < array.length;j++){
                /*
                 Wenn die Zahl gleich oder groesser als der
                 Zaehler "Maximum" ist, dann wird # ausgegeben.
                 */
                if (array[j] >= maximum){
                    System.out.print("# ");
                // Ansonsten wird eine leerstelle ausgegeben.
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
