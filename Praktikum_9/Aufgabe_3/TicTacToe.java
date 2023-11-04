
public class TicTacToe {
    private static final int[] feld = new int[9];

    private int counter = 1;
    private int cheak_counter;
    TicTacToe() {

        reset();

    }

    public static void reset() {
        // Das Spielfeld wird damit erstellt und ausgedruckt.
        for (int i = 0; i < feld.length; i++) {

            if (feld[i] == 0) {
                if (i == 2 || i == 5) {
                    System.out.print("  " + "\n-+-+-\n");
                } else {
                    if (i == 8) {
                        System.out.println("  ");
                    } else {
                        System.out.print(" |");
                    }
                }
            }
        }
    }

    public void macheZug(int x, int y) {
        int position = (x*3)+y;
        int counter_feld = 0;
        int cheak = 0;

        // Es wird uberprueft, ob die Eingabe gueltig ist.
        if (x < 0 || x > 2 || y < 0 || y > 2) {
            System.err.println("Ihre Eingabe ist ungueltig !");
            System.exit(0);
        }
        // Die Anweisungen werden erst erfuellt,
        // wenn kein Gewinner vorhanden ist oder das Spiel nicht beendet ist
        if(cheak_counter == 0 ) {

        // Damit wird es festgestellt, ob X oder O dran ist.
        if (counter == 3) {
            counter = 1;
        }

         // Es wird ueberprueft, ob diese Position frei ist.
        if (feld[position] == 0) {
            feld[position] = counter;
            counter++;
        } else {
            // Falls die Position besitzt ist.
            System.err.println("Diese Position :[" + x + "]" + "[" + y + "] ist besitzt");
            System.exit(0);
        }
            // Damit wird gleich festgestellt, ob das Spiel unentschieden beendet ist.
            for (int i = 0; i < feld.length; i++) {
                    if (feld[i] != 0) {
                        cheak++;
                    }
            }
            System.out.println();


              // Das Konzept des Spieles "Tic Tac Toe" wird damit erstellt.
               if ((feld[0] == 1 && feld[1] == 1 && feld[2] == 1) || (feld[3] == 1 &&feld[4] == 1
                       && feld[5] == 1) && (feld[6] == 1 && feld[7] == 1 && feld[8] == 1) ||
                       (feld[0] == 1 && feld[3] == 1 &&feld[6] == 1) ||
                       (feld[1] == 1 && feld[4] == 1 && feld[7] == 1) ||
                       (feld[2] == 1 && feld[5] == 1 && feld[8] == 1) ||
                       (feld[0] == 1 && feld[4] == 1 && feld[8] == 1) ||
                       (feld[2] == 1 && feld[4] == 1 && feld[6] == 1)) {
                   System.out.println("Super! X hat gewonnen.");
                   cheak_counter++;

               }
               if ((feld[0] == 2 && feld[1] == 2 && feld[2] == 2) || (feld[3] == 2 &&feld[4] == 2
                       && feld[5] == 2) && (feld[6] == 2 && feld[7] == 2 && feld[8] == 2) ||
                       (feld[0] == 2 && feld[3] == 2 &&feld[6] == 2) ||
                       (feld[1] == 2 && feld[4] == 2 && feld[7] == 2) ||
                       (feld[2] == 2 && feld[5] == 2 && feld[8] == 2) ||
                       (feld[0] == 2 && feld[4] == 2 && feld[8] == 2) ||
                       (feld[2] == 2 && feld[4] == 2 && feld[6] == 2)) {
                   System.out.println("Super! O hat gewonnen.");
                   cheak_counter++;

               }
               // Falls das Spiel keinen Gewinner existiert.
               if (cheak == 9) {
                   System.out.println("Das Spiel wurde als unentschieden beendet");
                   cheak_counter++;
                   System.exit(0);
               }
           }
           else {
               System.err.println("Fangen Sie eine neue Runde an.");
        }
    }

        public void zeigeSpielfeld(){
            /* Damit wird das Spielfeld erzeugt und ausgedruckt.
             und gleichzeitig wird kontrolliert, wo 1 steht, dann wird eine X ausgedruckt.
             wo 2 steht, dann wird ein O ausgedruckt. und wo 0 steht, dann wird eine leer-stelle ausgedruckt.
             */
            for (int i = 0; i < feld.length; i++) {

                if (feld[i] == 0) {
                    if (i == 2 || i == 5) {
                        System.out.print("  " + "\n-+-+-\n");
                    } else {
                        if (i == 8) {
                            System.out.println("  ");
                        } else {
                            System.out.print(" |");
                        }
                    }
                }
                if (feld[i] == 1){
                    if (i == 2 || i == 5) {
                        System.out.print("X " + "\n-+-+-\n");
                    } else {
                        if (i == 8) {
                            System.out.println("X ");
                        } else {
                            System.out.print("X|");
                        }
                    }
                }
                if (feld[i] == 2){
                    if (i == 2 || i == 5) {
                    System.out.print("O " + "\n-+-+-\n");
                } else {
                    if (i == 8) {
                        System.out.println("O ");
                    } else {
                        System.out.print("O|");
                    }
                  }
                }
            }
            System.out.println("_______________");
        }
        }