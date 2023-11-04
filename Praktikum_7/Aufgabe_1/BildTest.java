import java.io.IOException;
import java.time.LocalDate;

public class BildTest {
    public static void main(String[] args) throws IOException {

       Bild bild = new Bild();
       bild.leseBild("java.pgm");
       bild.rotiereBild();
       LocalDate verzeichnis = LocalDate.now();
       bild.schreibBild(String.valueOf(verzeichnis));

    }
}
