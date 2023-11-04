public class Fahrradgruppe {


    private Fahrrad startFahrrad;

    public Fahrradgruppe() {
        this.startFahrrad = null;
    }

    public void addFahrrad(Fahrrad f) {
        if (startFahrrad == null) {
            // Wenn kein Fahrrad vorhanden ist
            startFahrrad = f;
        } else {
            // Ein neues Fahrrad wird vor dem ersten Fahrrad in die Gruppe eingefuegt.
            f.setNext(startFahrrad);
            startFahrrad = f;
        }
    }

    public int reisegeschwindigkeit() {
        if (startFahrrad == null) {
            return 0;
        } else {
            // Ermittel das langsamste Fahrrad und speichere seine Geschwindigkeit
            Fahrrad f = startFahrrad;
            int geschwindigkeit = f.speed();

            while (f.hasNext()) {
                f = f.getNext();
                if (geschwindigkeit > f.speed()) {
                    // Die langsamere Geschwindigkeit wird damit festgestellt.
                    geschwindigkeit = f.speed();
                }
            }
            return geschwindigkeit;
        }
    }

    public void addLadung(int anzahl) {
        // Ermittel das schnellste Fahrrad und gebe ihm 1 Ladung
        for (int i = 0; i < anzahl; i++) {
            Fahrrad f = startFahrrad;
            Fahrrad schnellstesFahrrad = startFahrrad;
            while (f.hasNext()) {
                // das schnellere Fahrrad wird damit festgestellt.
                f = f.getNext();
                if (schnellstesFahrrad.speed() < f.speed()) {
                    schnellstesFahrrad = f;
                }
            }

            schnellstesFahrrad.setLadung(schnellstesFahrrad.getLadung() + 1);
        }
    }

    public void print() {
        // zum Ausdrucken.
        Fahrrad f = startFahrrad;
        int counter = 1;
        System.out.println("Fahrrad " + counter + " Geschindigkeit: " + f.speed());
        while (f.hasNext()) {
            f = f.getNext();
            counter++;
            System.out.println("Fahrrad " + counter + " Geschindigkeit: " + f.speed());
        }
    }

}
