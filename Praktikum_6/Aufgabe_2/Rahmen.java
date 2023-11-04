import java.util.ArrayList;

public class Rahmen {
    ArrayList <String> array = new ArrayList<String>();

    public void printRahmen(){
        //Zu ueberpruefen, ob es ein leeres Array ist.
        if (array.size()==0){
            System.err.println("");
            System.exit(0);
        }

        String [] speicherArray = new String[array.size()];
        int big_one = 0;
        int leerstellenzaehler = 0 ;

        // Die Elemente werden im SpeicherArray gespeichert.
        for (int i = 0 ; i < speicherArray.length;i++){
            speicherArray[i] = array.get(i);
        }

        big_one = speicherArray[0].length();
        for (int i = 0 ; i < speicherArray.length;i++) {
            // Die groesste Elementanzahl wird in "big_one" gespeichert.
            if (big_one < speicherArray[i].length()) {
                big_one = speicherArray[i].length();
            }
        }
            // Die Erste Zeile wird ausgedruckt.
            for (int i = 0 ; i < big_one + 4 ; i++){
                System.out.print("*");
            }
        System.out.println();
            for (int i = 0 ; i < speicherArray.length ; i++){
                for (int j = i ; j <= i ; j++){
                    // Es wird uberprueft, ob die Laenge des Wortes gleich die groesste Elementanzahl.
                    if (speicherArray[i].length() == big_one ) {
                        System.out.print("* " + speicherArray[i] + " *");
                    }
                    else {
                        // Es wird festgestellt, wie viel Leerstellen noch hin sollen.
                        leerstellenzaehler = big_one - speicherArray[i].length();
                        System.out.print("* "+ speicherArray[i]);
                        // Hier werden die Leerstellen ausgedruckt.
                        for (int z = 0 ; z < leerstellenzaehler ; z++){
                            System.out.print(" ");
                        }
                        System.out.print(" *");
                    }
                }
                System.out.println();
            }
            // Die letzte Zeile wird ausgedruckt.
        for (int i = 0 ; i < big_one + 4 ; i++){
            System.out.print("*");
        }
        }
    }




