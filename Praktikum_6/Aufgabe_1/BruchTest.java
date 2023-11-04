public class BruchTest {
    public static void main(String[] args) {
        Bruch bruch1 = new Bruch(34, 42);
        Bruch bruch2 = new Bruch(7, 3);
        System.out.println(bruch1.toString());
        System.out.println(bruch2.toString());
        System.out.println();
        bruch1.add(bruch2);
        bruch1.multiply(bruch2);


    }
}
