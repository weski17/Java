public class Zoom {
    private int[][] array;
    private int[][] newArray;

    public void setArray(int[][] array) {
        this.array = array;
    }

    public int[][] zoom(int f) {
        // Die Laenge des Arrays ueberpruefen
        if (array.length == 0 || f < 1) {
            System.exit(0);
        }
        // Die Graustufen ueberpruefen.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > 7) {
                    System.exit(0);
                }
            }
        }
        //Die laenge des neuen Arrays festgelegt.

        newArray = new int[array.length * f][array.length * f];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                newArray[i][j] = array[i / f][j / f];
            }

        }
        return newArray;
    }

    public int[][] getNewArray() {
        return newArray;
    }

}
