import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import com.example.Constants; // Import the missing Constants interface

public class SeventhProgram {
 public static void main(String[] args) {
  SwingUtilities.invokeLater(new Runnable() {
   public void run() {
    GUI program = new GUI("Switches and Bulbs");
    program.setSize(500, 500);
    program.setLocationRelativeTo(null);
    program.setVisible(true);
   }
  });
 }
}

class GUI extends JFrame implements Constants, ActionListener {
 JPanel cards;
 JPanel card1, card2, card3;
 JPanel[] bulbPans = new JPanel[3];

 JButton goToRoom, back;
 JLabel[] switches = new JLabel[3];
 ImageIcon switchonIMG, switchoffIMG;
 JLabel[] bulbs = new JLabel[3];

 boolean[] switchstate = new boolean[3];

 public GUI(String arg) {
  super(arg);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setResizable(false);

  init();

  add(cards);
 }

 public void init() {
  initCard1();
  initCard2();
  setCard();
 }

 public void initCard1() {
  JPanel top = new JPanel(new FlowLayout(FlowLayout.CENTER));
  JPanel bot = new JPanel(new FlowLayout(FlowLayout.CENTER));

  card1 = new JPanel(new BorderLayout());

  switchonIMG = new ImageIcon("switchon.jpg", "switch1.jpg");
  switchoffIMG = new ImageIcon("switchoff.jpg", "switch2.jpg");

  for (int i = 0; i < switches.length; i++) {
   switches[i] = new JLabel(switchoffIMG);
  
  for (int i = 0; i < switchstate.length; i++) {
   switches[i].addMouseListener((MouseListener) new MouseAdapter() {
    // Rest of the code...
   });
  }

  card1 = new JPanel();
  card1.setLayout(new GridLayout(1, 3));
  for (int i = 0; i < 3; i++) {
   card1.add(bulbPans[i]);
  }

  card2 = new JPanel();
  card2.setLayout(new GridLayout(1, 3));
  for (int i = 0; i < 3; i++) {
   card2.add(bulbPans[i]);
  }

  card3 = new JPanel();
  card3.setLayout(new GridLayout(1, 3));
  for (int i = 0; i < 3; i++) {
   card3.add(bulbPans[i]);
  }

  cards = new JPanel(new CardLayout());
  cards.add(card1, "card1");
  cards.add(card2, "card2");
  cards.add(card3, "card3");

  add(cards, BorderLayout.CENTER);

  JPanel buttonPanel = new JPanel();
  JButton card1Button = new JButton("Card 1");
  card1Button.addActionListener(this);
  buttonPanel.add(card1Button);

  JButton card2Button = new JButton("Card 2");
  card2Button.addActionListener(this);
  buttonPanel.add(card2Button);

  JButton card3Button = new JButton("Card 3");
  card3Button.addActionListener(this);
  buttonPanel.add(card3Button);

  add(buttonPanel, BorderLayout.SOUTH);
 }

 public void actionPerformed(ActionEvent e) {
  // Handle action events here
 }
}