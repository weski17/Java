import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class WeihnachtsGUI extends JFrame implements ActionListener{
    Container c;
    JLabel label1;
    JTextField textfeld1;
    JRadioButton radio1;
    JRadioButton radio2;
    JCheckBox check1;
    JButton buttonSend;
    JLabel label2;
    Leinwand l;
    public WeihnachtsGUI(){
        //Leinwand
        JPanel leftPanel = new JPanel();
        l = new Leinwand();
        l.setBackground(Color.black);
        l.setPreferredSize(new Dimension(740,480));
        l.setToolTipText("Zeichenfeld");
        leftPanel.add(l);
        //Menü
        JPanel rightPanel = new JPanel(new BorderLayout());
        JPanel rightInnerPanel1 = new JPanel();
        // Textfeld für den Personennamen
        label1 = new JLabel();
        label1.setText("Autor:");
        textfeld1 = new JTextField();
        textfeld1.setPreferredSize(new Dimension(100,20));
        label1.setToolTipText("adressierte Person");
        textfeld1.setToolTipText("Name der Person");
        rightInnerPanel1.add(label1);
        rightInnerPanel1.add(textfeld1);
        // Parameterfeld
        JPanel rightInnerPanel2 = new JPanel(new GridLayout());
        Border blackline = BorderFactory.createTitledBorder("Parameter");
        rightInnerPanel2.setBorder(blackline);
        radio1 = new JRadioButton();
        radio1.setText("Tannenbaum");
        radio1.setToolTipText("zeichnet einen Tannenbaum");
        radio1.addActionListener(this);
        radio2 = new JRadioButton();
        radio2.setText("Wald");
        radio2.setToolTipText("zeichnet einen Wald");
        radio2.addActionListener(this);
        ButtonGroup bg = new ButtonGroup();
        bg.add(radio1);
        bg.add(radio2);
        check1 = new JCheckBox();
        check1.setText("Santa");
        check1.setToolTipText("Sante");
        check1.addActionListener(this);
        JPanel parameterInnerPanel1 = new JPanel(new BorderLayout());
        parameterInnerPanel1.add(radio1, BorderLayout.PAGE_START);
        parameterInnerPanel1.add(radio2, BorderLayout.LINE_START);
        parameterInnerPanel1.add(check1, BorderLayout.PAGE_END);
        rightInnerPanel2.add(parameterInnerPanel1, BorderLayout.LINE_START);
        // Ausführender Button
        buttonSend = new JButton();
        buttonSend.setText("Start");
        buttonSend.setToolTipText("erstellt Grußkarte");
        buttonSend.addActionListener(this);
        rightInnerPanel2.setToolTipText("Einstellungen");
        JPanel panelWithBlinds = new JPanel(new BorderLayout());
        panelWithBlinds.add(rightInnerPanel2, BorderLayout.PAGE_START);
        JLabel empty = new JLabel();
        panelWithBlinds.add(empty, BorderLayout.CENTER);
        rightPanel.add(rightInnerPanel1, BorderLayout.PAGE_START);
        rightPanel.add(panelWithBlinds, BorderLayout.CENTER);
        rightPanel.add(buttonSend, BorderLayout.PAGE_END);
        //Statuszeile
        JPanel lowerPanel = new JPanel(new BorderLayout());
        label2 = new JLabel("-");
        label2.setToolTipText("Status der Karte");
        lowerPanel.add(label2, BorderLayout.LINE_START);
        //Container
        c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(leftPanel, BorderLayout.LINE_START);
        c.add(rightPanel, BorderLayout.LINE_END);
        c.add(lowerPanel, BorderLayout.PAGE_END);
    }
    //Verarbeitung
    @Override
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == buttonSend){

            if(radio1.isSelected()){
                label2.setText("Tannenbaum");
                l.setStatus(1);
                l.repaint();
            }
            else if(radio2.isSelected()){
                label2.setText("Wald");
                l.setStatus(2);
                l.repaint();
            }
            else{
                label2.setText("-");
            }
        }
        else{
            label2.setText("-");
        }
    }
}