public class Main {

    public static void main(String[] args) {
        MaxTeilumme3 mT3 = new MaxTeilumme3();

        System.out.println("Test mit eigene Datei");
        mT3.maxTeilsumme3();
        System.out.println("\nTest mit 30");
        mT3.maxTeilsumme3(30);
        System.out.println("\nTest mit 300");
        mT3.maxTeilsumme3(300);
        System.out.println("\nTest mit 3000");
        mT3.maxTeilsumme3(3000);
    }
}
