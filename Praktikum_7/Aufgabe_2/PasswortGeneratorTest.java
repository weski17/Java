public class PasswortGeneratorTest {
    public static void main(String[] args) {
    PassworGenerator ex1 = new PassworGenerator();
    PassworGenerator ex2 = new PassworGenerator();

    String pass1 = "java ist eine  objekt-orientierte sprache!";
    ex1.erstellePasswort(pass1);
    ex1.print();

    System.out.println("_____________________");

    String pass2 = "Java ist auch eine 2Insel (von Christian Ullenboom)";
    ex2.erstellePasswort(pass2);
    ex2.print();


    }
}
