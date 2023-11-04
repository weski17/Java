public class EinkaufswagenTest {
    public static void main(String[] args) {
        // Cart Objekt von der Klasse Einkaufswagen.
        Einkaufswagen cart = new Einkaufswagen();
        cart.addToCart("Birne");
        cart.addToCart("Salat");
        cart.addToCart("Paprika");
        cart.showContent();
        cart.removeFromCart("Salat");
        System.out.println();
        cart.showContent();
        cart.size();
    }
}
