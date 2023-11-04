public class Abstand2 extends Datenverarbeitung{

	@Override
	public double berechneAbstand(double[] a, double[] b) {
		double d = 0;
		
		// Hier wird die Summe des Absolut Betrags ausgerechnet.
		for (int i = 0; i < 4; i++ ) {
			d += Math.abs(a[i] - b[i]);
		}
		
		// Hier wird gerundet.
		double temp = (int)((d + 0.005) * 100);
		d = (double) temp / 100;
		
		return d;
	}
}
