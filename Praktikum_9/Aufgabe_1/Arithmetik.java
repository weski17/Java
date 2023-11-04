public class Arithmetik {
    private Rechenweg rechnung;
    public void bestimmeRechenweg (Rechenweg r){
        this.rechnung = r ;
    }
    public double berechne(double a , double b){
    return (rechnung.berechneErgebnis(a, b));
    }

}
