import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.util.Random;
import javax.swing.*;
public class XO implements ActionListener {
    private final int maxSize = 9;

    private Random random = new Random();
    private JFrame frame = new JFrame();
    private JPanel title_panel = new JPanel();
    private JPanel button_panel = new JPanel();
    private JLabel textfield = new JLabel();

    private JButton[] buttons = new JButton[maxSize];
    private ImageIcon image = new ImageIcon("C:\\Users\\suuuuu\\IdeaProjects\\X_O\\src\\LogoWae.png");
    private JLabel backgroundImage = new JLabel(image);
    private boolean player1;

    public XO() throws InterruptedException {
        backgroundImage.setOpaque(false);
        backgroundImage.setLayout(new FlowLayout());
        //frame.add(backgroundImage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        // frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("X vs O");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 250));

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();

    }

    private void firstTurn() throws InterruptedException {
        Thread.sleep(2000);
        int randomNumber = random.nextInt(2);
        if (randomNumber == 0) {
            player1 = true;
            textfield.setText("X Turn");
        } else {
            player1 = false;
            textfield.setText("O Turn");
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1) {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1 = false;
                        textfield.setText("O turn");
                        check();
                    }
                } else {
                    if (buttons[i].getText() == "") {
                        buttons[i].setForeground(new Color(255, 250, 0));
                        buttons[i].setText("O");
                        player1 = true;
                        textfield.setText("X turn");
                        check();

                    }
                }
            }
        }


    }
    public void oWins (int a, int b , int c) {
        textfield.setText("O Won ");
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9 ;i++ ){
            buttons[i].setEnabled(false);
        }
    }
    private void check () {
        if ((buttons[0].getText() == "X")
           && (buttons[1].getText() == "X")
           && (buttons[2].getText() == "X")
        ) {
            xWins(0,1,2);
        }

     if ((buttons[3].getText() == "X")
            && (buttons[4].getText() == "X")
            && (buttons[5].getText() == "X")
            ) {
        xWins(3,4,5);
    }
      if ((buttons[6].getText() == "X")
            && (buttons[7].getText() == "X")
            && (buttons[8].getText() == "X")
            ) {
        xWins(6,7,8);
      }
        if ((buttons[0].getText() == "X")
                && (buttons[3].getText() == "X")
                && (buttons[6].getText() == "X")
        ) {
            xWins(0,3,6);
        }
        if ((buttons[1].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[7].getText() == "X")
        ) {
            xWins(1,4,7);
        }
        if ((buttons[2].getText() == "X")
                && (buttons[5].getText() == "X")
                && (buttons[8].getText() == "X")
        ) {
            xWins(2,5,8);
        }
        if ((buttons[0].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[8].getText() == "X")
        ) {
            xWins(0,4,8);
        }
        if ((buttons[2].getText() == "X")
                && (buttons[4].getText() == "X")
                && (buttons[6].getText() == "X")
        ) {
            xWins(2,4,6);
        }


        if ((buttons[0].getText() == "O")
                && (buttons[1].getText() == "O")
                && (buttons[2].getText() == "O")
        ) {
            oWins(0,1,2);
        }

        if ((buttons[3].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[5].getText() == "O")
        ) {
            oWins(3,4,5);
        }
        if ((buttons[6].getText() == "O")
                && (buttons[7].getText() == "O")
                && (buttons[8].getText() == "O")
        ) {
            oWins(6,7,8);
        }
        if ((buttons[0].getText() == "O")
                && (buttons[3].getText() == "O")
                && (buttons[6].getText() == "O")
        ) {
            oWins(0,3,6);
        }
        if ((buttons[1].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[7].getText() == "O")
        ) {
            oWins(1,4,7);
        }
        if ((buttons[2].getText() == "O")
                && (buttons[5].getText() == "O")
                && (buttons[8].getText() == "O")
        ) {
            oWins(2,5,8);
        }
        if        ((buttons[0].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[8].getText() == "O")
        ) {
            oWins(0,4,8);
        }
        if ((buttons[2].getText() == "O")
                && (buttons[4].getText() == "O")
                && (buttons[6].getText() == "O")
        ) {
            oWins(2, 4, 6);
        }
    }

    public void xWins(int a, int b , int c) {
        textfield.setText("X Won ");
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9 ;i++ ){
            buttons[i].setEnabled(false);
        }

    }
}

