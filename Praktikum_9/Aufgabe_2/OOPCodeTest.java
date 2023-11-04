import java.io.IOException;

public class OOPCodeTest {
    public static void main(String[] args) throws IOException {
         int [][] ex = {{0,0,0},{0,1,0},{0,0,1}};
         OOPCode obj = new OOPCode(3,ex);
         obj.zahlenpotenz();
         System.out.println("-------------------");
        System.out.println("Beispiel:1");
      obj.groessten();
        System.out.println();
         System.out.println("2.Beispiel");
         int [][] ex1 = {{0,0,0,0},{1,0,0,0},{0,0,1,0},{0,0,0,0}};
         OOPCode obj1 = new OOPCode(4,ex1);
         obj1.zahlenpotenz();
         System.out.println("___________________");
         obj1.groessten();


    }
}
