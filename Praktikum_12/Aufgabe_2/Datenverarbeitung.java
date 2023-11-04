

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public abstract class Datenverarbeitung {
	
	// Arrays fuer die Daten der 3 Pflanzenarten
	protected double[][] cluster1;
	protected double[][] cluster2;
	protected double[][] cluster3;

	
	// Diese Methode macht grundsaetzlich alles, man braucht nur sie aufrufen
	public final void ladenVerarbeitenSpeichern(String dateipfad) {
		ladeDaten(dateipfad);
		
		// Vektor "Mittelwert" wird in den einzelnen Arrays gespeichert
		double[] a = berechneMittelwert(cluster1);
		double[] b = berechneMittelwert(cluster2);
		double[] c = berechneMittelwert(cluster3);

		// Der Abstand der verschiedenen Moeglichkeitenn wird berechnet
		double e = berechneAbstand(a, b);
		double f = berechneAbstand(a, c);
		double g = berechneAbstand(b, c);
		
		// Der Abstand wird ausgegeben
		ausgabe(e, f, g);
	}
	
	// Abstrakte Methode, die in Unterklassen definiert werden muss
	public abstract double berechneAbstand(double[] a, double[] b);
	
	// Methode um den Mittelwert der einzelnen Werte zu berechnen
	public double[] berechneMittelwert(double[][] cluster) {
		
		double mittelwert[] = new double[4];
		
		double temp = 0;
		
		// Berechnet wird das arithmetische Mittel, alle 50 Werte werden in temp addiert und anschliessend mit 50 dividiert
		// Danach wird der jeweilige Wert in eine der 4 Slots des mittelwert-Arrays gespeichert
		for (int i = 0; i < cluster[0].length; i++) {
			for (int j = 0; j < cluster.length; j++) {
				temp += cluster[j][i];
			}
			
			temp /= 50;

			
			mittelwert[i] = temp;
			temp = 0;
		}
		return mittelwert;
	}
	
	// Methode um die Daten in die Cluster zu laden
	public void ladeDaten(String dateipfad) {
		Path path = Paths.get(dateipfad);
		
		try {
			// Datei wird in String-Liste geladen
			List<String> inhalt = Files.readAllLines(path);
			
			// Cluster werden initialisiert
			cluster1 = new double[50][4];
			cluster2 = new double[50][4];
			cluster3 = new double[50][4];
			
			// Die Counts sind die Zeilenwerte der jeweiligen Cluster
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			
			// Die Strings, fuer die Zuweisung zum jeweiligen Cluster
			String string1 = "Iris-setosa";
			String string2 = "Iris-versicolor";
			String string3 = "Iris-virginica";

			/*
			 * Die folgenden Zeilen iterieren durch inhalt undzwar Zeilenweise, wenn eine Zeile der Liste
			 * inhalt den jeweiligen String enthaelt werden die 4 double Zahlen der jeweiligen Zeile in das
			 * passende cluster gepackt. temp2 dient der Erh�hung von den jeweiligen counts.
			 */
			for (int i = 0; i < inhalt.size(); i++) {
				String temp[] = inhalt.get(i).split(",");
				double temp2 = 0;

				for (int j = 0; j < 4; j++) {
					if (inhalt.get(i).contains(string1)) {
						cluster1[count1][j] = Double.parseDouble(temp[j]); 
						temp2 += 0.25;
					}
					else if (inhalt.get(i).contains(string2)) {
						cluster2[count2][j] = Double.parseDouble(temp[j]); 
						temp2 += 0.5;
					}
					else if (inhalt.get(i).contains(string3)) {
						cluster3[count3][j] = Double.parseDouble(temp[j]); 
						temp2 += 1;
					}
				}
				
				if (temp2 == 1) {
					count1 += 1;
					temp2 = 0;
				}
				else if(temp2 == 2) {
					count2 += 1;
					temp2 = 0;
				}
				else if (temp2 == 4) {
					count3 += 1;
					temp2 = 0;
				}
			}			
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Wahrscheinlich falsche Datei");
		}
	}
	
	// Diese Methode gibt die Ergebnisse aus
	public void ausgabe(double a, double b, double c) {
		System.out.printf("Ergebnis fuer %s:%n", this.getClass().getSimpleName());
		System.out.printf("d(%s, %s) = %.2f%n", "cluster1", "cluster2", a);
		System.out.printf("d(%s, %s) = %.2f%n", "cluster1", "cluster3", b);
		System.out.printf("d(%s, %s) = %.2f%n%n", "cluster2", "cluster3", c);
	}

}
