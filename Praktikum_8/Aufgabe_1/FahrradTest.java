public class FahrradTest {

    public static void main(String[] args) {
        Fahrradgruppe gruppe1 = new Fahrradgruppe();

        Fahrrad fahrrad = new Fahrrad(10);
        fahrrad.setLadung(4);
        gruppe1.addFahrrad(fahrrad);
        fahrrad = new Fahrrad(8);
        fahrrad.setLadung(3);
        gruppe1.addFahrrad(fahrrad);
        fahrrad = new Fahrrad(19);
        fahrrad.setLadung(2);
        gruppe1.addFahrrad(fahrrad);

        System.out.println("Gruppe 1 reisegeschwindigkeit: " + gruppe1.reisegeschwindigkeit());
        gruppe1.print();

        gruppe1.addLadung(18);

        System.out.println("___________");
        gruppe1.print();
        System.out.println("Gruppe 1 reisegeschwindigkeit: " + gruppe1.reisegeschwindigkeit());
    }

}
