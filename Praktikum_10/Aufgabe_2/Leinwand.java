import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Leinwand extends JPanel {
    private int status = 0;
    private final int ABSTAND = 100;

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // wenn ein Baum gezeichnet werden soll
        if (status == 1) {
            // Position und groeße werden zufaellig bestimmt
            int randomSize = (int) (Math.random() * (50 - 25 + 1) + 25);
            int randomPosX = (int) (Math.random() * (650 - 80 + 1) + 80);
            int randomPosY = (int) (Math.random() * (380 - 150 + 1) + 150);
            g.setColor(new Color(100, 255, 100));
            g.fillPolygon(new int[]{randomPosX - randomSize, randomPosX, randomPosX + randomSize}, new int[]{randomPosY, randomPosY - 50, randomPosY}, 3);
            g.fillPolygon(new int[]{randomPosX - randomSize - 10, randomPosX, randomPosX + randomSize + 10}, new int[]{randomPosY + 30, randomPosY - 20, randomPosY + 30}, 3);
            g.fillPolygon(new int[]{randomPosX - randomSize - 20, randomPosX, randomPosX + randomSize + 20}, new int[]{randomPosY + 60, randomPosY + 10, randomPosY + 60}, 3);
        }
        // wenn ein Wald gezeichnet werden soll
        else if (status == 2) {
            // es wird Ueberprueft, ob die Baeume sich nicht zu nah kommen, indem der Abstand zwischen den Startpositionen errechnet wird
            int tries = 0;
            ArrayList<Integer> xCoordinates = new ArrayList<>();
            ArrayList<Integer> yCoordinates = new ArrayList<>();
            // Positionen werden hier zufaellig bestimmt und in eine Liste eingefügt
            int randomSize = (int) (Math.random() * (50 - 25 + 1) + 25);
            int randomPosX = (int) (Math.random() * (650 - 80 + 1) + 80);
            int randomPosY = (int) (Math.random() * (380 - 150 + 1) + 150);
            xCoordinates.add(randomPosX);
            yCoordinates.add(randomPosY);
            for (int i = 1; i < 10; i++) {
                boolean positionValid = false;
                while (!positionValid && tries < 1000) {
                    randomPosX = (int) (Math.random() * (650 - 80 + 1) + 80);
                    randomPosY = (int) (Math.random() * (380 - 150 + 1) + 150);
                    positionValid = true;
                    for (int j = 0; j < xCoordinates.size(); j++) {
                        if (Math.abs(Math.sqrt(Math.pow(randomPosX - xCoordinates.get(j), 2) + Math.pow(randomPosY - yCoordinates.get(j), 2))) <= ABSTAND) {
                            positionValid = false;
                            tries++;
                        }
                    }
                }
                xCoordinates.add(randomPosX);
                yCoordinates.add(randomPosY);
            }
            Collections.sort(yCoordinates);
            // es werden so viele Baeume erzeugt, wie es Startpositionen zum Zeichnen gibt
            for(int j = 0; j < xCoordinates.size(); j++){
                // Größe zufällig festgelegt
                randomSize = (int) (Math.random() * (50 - 25 + 1) + 25);
                // Farbe wird zufaellig generiert
                g.setColor(new Color(0,(int)(Math.random()*(255-30+1)+30),0));
                g.fillPolygon(new int[]{xCoordinates.get(j) - randomSize, xCoordinates.get(j), xCoordinates.get(j) + randomSize}, new int[]{yCoordinates.get(j), yCoordinates.get(j) - 50, yCoordinates.get(j)}, 3);
                g.fillPolygon(new int[]{xCoordinates.get(j) - randomSize - 10, xCoordinates.get(j), xCoordinates.get(j) + randomSize + 10}, new int[]{yCoordinates.get(j) + 30, yCoordinates.get(j) - 20, yCoordinates.get(j) + 30}, 3);
                g.fillPolygon(new int[]{xCoordinates.get(j) - randomSize - 20, xCoordinates.get(j), xCoordinates.get(j) + randomSize + 20}, new int[]{yCoordinates.get(j) + 60, yCoordinates.get(j) + 10, yCoordinates.get(j) + 60}, 3);
            }
        }

    }
}