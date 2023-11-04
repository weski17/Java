import java.util.ArrayList;

public class Einkaufswagen {
    // Array erstellt.
    private ArrayList<String> einkauf = new ArrayList<String>();

    public void addToCart(String item) {
        // Zu ueberpruefen, ob die laenge des Arrays kleiner gleich 5 ist.
        if (einkauf.size()<=5) {
            // Objekt hinfuegen.
            einkauf.add(item);
        }
    }

    public void removeFromCart(String item) {
        // Objekt loeschen.
        if(einkauf.size()>=1) {
            einkauf.remove(item);
        }
    }

    public void showContent() {
        // Objekte ausdrucken.
        for (String i :einkauf ){
            System.out.println(i);
        }

    }

    public void size() {
        // Die Laenge des Arrays wird ausgedruckt
        System.out.println(einkauf.size());
    }
}
