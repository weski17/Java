public class TicTacToeTest {
    public static void main(String[] args) {
    TicTacToe ticTacToe = new TicTacToe();
        System.out.println("__________________");
        ticTacToe.macheZug(0,0);
        ticTacToe.zeigeSpielfeld();
        ticTacToe.macheZug(1,2);
        ticTacToe.zeigeSpielfeld();
        ticTacToe.macheZug(0,1);
        ticTacToe.zeigeSpielfeld();
        ticTacToe.macheZug(2,2);
        ticTacToe.zeigeSpielfeld();
        ticTacToe.macheZug(0,2);
        ticTacToe.zeigeSpielfeld();


    }
}
