
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Leinwand extends JPanel{

	public int sliderWert;
	public int status;
	
	// grad ist der grundsaetzliche Winkel
	double grad;
	
	// faktor ist immer der Winkel des aktuell zu zeichnenden Kreisauschnittes
	double faktor;
	
	// Konstrukor, offensichtlich
	public Leinwand(int sliderWert, int status) {
		this.status = status;
		this.sliderWert = sliderWert;
		
		grad =  360.0 / (sliderWert * sliderWert);
		faktor = grad;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		
		if (status == 1) {
			// Hier werden Kreisausschnitte zeilenweise gezeichnet
			for (int i = 0; i < sliderWert; i++) {
				for (int j = 0; j < sliderWert; j++) {
					zeichneKreisausschnitt(g, i, j);
				
					faktor += grad + 0.0000001;
				}
			}
		}
		faktor = grad;
	}
	
	// Zeichnet die Kreisausschnitte mit den jeweiligen Werten
	public void zeichneKreisausschnitt(Graphics g, int i, int j) {

		int groesse = 470/ sliderWert;

		g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
		
		g.fillArc(j*groesse, i*groesse , groesse, groesse, 0, (int) faktor);
		
	}
}
