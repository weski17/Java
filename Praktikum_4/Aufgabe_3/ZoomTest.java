public class ZoomTest {
    public static void main(String[] args) {
        Zoom zoom = new Zoom();


        int[][] test1 = {
                {1, 7, 0},
                {1, 0, 3},
                {0, 2, 1}
        };
        // Hier werden die Methoden aufgerufen.
        zoom.setArray(test1);
        zoom.zoom(2);
        ausgabe1(zoom.getNewArray());
        System.out.println("*******************************************");
        zoom.zoom(3);
        ausgabe1(zoom.getNewArray());


        System.out.println("----------------------------------");

        int[][] test2 = {
                {1, 0, 2},
                {4, 2, 4},
                {2, 0, 1}
        };
        zoom.setArray(test2);
        zoom.zoom(2);
        ausgabe1(zoom.getNewArray());
        System.out.println("************************************************");
        zoom.zoom(3);
        ausgabe1(zoom.getNewArray());

    }

    public static void ausgabe1(int [][] test) {
        // Hier wird das bearbeitetes bild ausgedruchkt
        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[i][j]);
            }
            System.out.println();
        }
    }

}
