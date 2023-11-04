public class MemoryTest1 {

    public static void main(String[] args) {

        // Ein Objekt erstellt.
        Memory1 memory = new Memory1();
        // Die Methoden aufrufen.
        memory.generateField(4);
        memory.ausgabe();

        System.out.println("____________________________________");
        memory.generateField(6);
        memory.ausgabe();
    }
}

