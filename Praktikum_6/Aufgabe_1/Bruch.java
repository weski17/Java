
public class Bruch {
    private int zaehler;
    private int nenner;
    public Bruch(int newZaehler, int newNenner){ // Konstruktor
        this.zaehler =newZaehler;
        // Es wird uberprueft, ob der Nenner 0 ist.
        if (newNenner==0) {
            System.err.println("Der Nenner darf kein null sein");
           System.exit(0);
        }
        else {
            this.nenner = newNenner;
        }
    }

    Bruch add(Bruch f){
        int counter =2;
        // Als Speicherplatz verwendet.
        Bruch helpBruch = new Bruch(1,1);
        /* wenn beide Bruechen denselben Nenner haben. */
     if (this.nenner == f.nenner){
         // Werden die Zaehlern miteinander addiert.
         helpBruch.zaehler= this.zaehler + f.zaehler;
     }
     else {
         helpBruch.zaehler = (this.zaehler * f.nenner)+(f.zaehler * this.nenner);
         helpBruch.nenner = this.nenner * f.nenner;

     }
     // Der Bruch wird so viel wie möglich gekuerzt.
        while (counter<=9){

            if (helpBruch.zaehler % counter == 0 && helpBruch.nenner % counter == 0){
                helpBruch.zaehler = (helpBruch.zaehler/counter);
                helpBruch.nenner = (helpBruch.nenner/counter);
                counter = 1 ;
            }
            counter++;
        }
        //Der Bruch wird ausgedruckt.
        System.out.println("Das Addierergebnis  = " + helpBruch.zaehler + " / " + helpBruch.nenner);
     return helpBruch;
     }

    public String toString(){
        return this.zaehler+" / "+ this.nenner;
    }

    Bruch multiply (Bruch f){
        int counter = 2 ;
        Bruch helpBruch = new Bruch(1,1);

        // Die Zaehlern werden miteinander multipliziert.
        helpBruch.zaehler = ( this.zaehler * f.zaehler );
        helpBruch.nenner = (this.nenner * f.nenner );
        // Der Bruch wird so viel wie möglich gekuerzt.
        while (counter<=9){
           //
            if (helpBruch.zaehler % counter == 0 && helpBruch.nenner % counter == 0){
                helpBruch.zaehler = (helpBruch.zaehler/counter);
                helpBruch.nenner = (helpBruch.nenner/counter);
                counter = 1 ;
            }
            counter++;
        }
        System.out.println("Multiplikation ergebnis = "+ helpBruch.zaehler + " / " + helpBruch.nenner );
        return helpBruch;
    }

}
