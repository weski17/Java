
public class Abstand1 extends Datenverarbeitung {

	@Override
	public double berechneAbstand(double[] a, double[] b) {
		double d = 0;
		
		// Hier wird die Summe ausgerechnet.
		for (int i = 0; i < 4; i++) {
			d += Math.pow(a[i] - b[i], 2);
		}
		
		// Wurzel aus der Summe
		d = Math.sqrt(d);
		
		// Hier wird kaufmännisch gerundet.
		double temp = (int)((d + 0.005) * 100);
		d = (double) temp / 100;
		
		
		return d;
	}

}
