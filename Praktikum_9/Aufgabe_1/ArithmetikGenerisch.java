public class ArithmetikGenerisch <Think extends Rechenweg> {
    private Think rechnung ;

    public ArithmetikGenerisch (Think rechenweg){
        this.rechnung = rechenweg;
    }
    public double berechne(double a, double b){
        Rechenweg r = (Rechenweg) rechnung ;
        return (r.berechneErgebnis(a,b));
    }
}
