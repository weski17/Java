
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.*;

public class Kreisausschnitt implements ActionListener {

	// Der Top-Level-Container
	JFrame frame = new JFrame();
	
	// Die Flaechen, links Leinwand, rechts Slider + Button
	JPanel links = new JPanel();
	JPanel rechts = new JPanel();
	
	// Slider und Button
	JSlider slider = new JSlider(JSlider.VERTICAL, 1, 10, 1);
	JButton button = new JButton("Start");
	
	// Die Flaeche auf der gezeichnet wird
	Leinwand malFlaeche;
	
	int status = 0;
	
	public Kreisausschnitt() {
		
		// Die grundsaetzlichen Eigenschaften des Frames
		frame.setTitle("Kreisausschnitt");
		frame.setSize(600, 517);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout());
		
		// Die Panel werden in diesen Methoden zum Frame geadded
		addEinstellungen();
		addZeichenflaeche();
	}
	
	// Hier wird Slider und Button geadded
	public void addEinstellungen() {
		
		// Hier wird Panel rechts zu dem frame geadded
		frame.add(rechts, BorderLayout.EAST);
		rechts.setPreferredSize(new Dimension(100, 0));
		rechts.setLayout(new BorderLayout());
		
		// Slider wird hinzugefuegt und die wichtigsten Einstellungen gesetzt
		rechts.add(slider, BorderLayout.NORTH);
		slider.setPreferredSize(new Dimension(100, 420));
		slider.setMinorTickSpacing(1);
		slider.setMajorTickSpacing(4);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		// Die Sliderwerte an denen die Label gesetzt werden 
		int a = 1;
		int b = 5;
		int c = 10;

		// Hashtable, an dem die Werte an mit dem Label verbunden werden
		Hashtable<Integer, JComponent> map = new Hashtable<>();
		map.put(Integer.valueOf(a), new JLabel("1x1"));
		map.put(Integer.valueOf(b), new JLabel("5x5"));
		map.put(Integer.valueOf(c), new JLabel("10x10"));
		
		// Fuegt dem Slider den Hashtable hinzu
		slider.setLabelTable(map);
		
		// Button wird geadded + ActionListener
		rechts.add(button);
		button.addActionListener(this);

		
	}
	
	// Hier wird die Zeichenflaeche dem Frame hinzugefuegt
	public void addZeichenflaeche() {
		
		// Hier wird Panel links zu dem Frame hinzugefuegt
		frame.add(links, BorderLayout.WEST); 
		links.setBackground(Color.white);
		links.setPreferredSize(new Dimension(480, 450));
		
		malFlaeche = new Leinwand(slider.getValue(), status);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Start")) {
			status = 1;
			
			// Wird removed
			links.remove(malFlaeche);
			
			// Wird hinzugefuegt
			malFlaeche = new Leinwand(slider.getValue(), status);
	
			// Setzt Werte
			malFlaeche.setBackground(Color.white);
			malFlaeche.setPreferredSize(new Dimension(480, 480));
			links.add(malFlaeche); 
			
			// Muss gemacht werden um Veraenderung auf Bildschirm anzuzeigen
			links.validate();
		}
	}
	
}
