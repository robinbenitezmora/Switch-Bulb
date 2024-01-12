import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
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
    public void mouseClicked(MouseEvent e) {
     if (switchstate[j]) {
      if (ON_RECTANGLE.contains(e.getX(), getY()));
      switchstate[j] = false;
     }
     else {
      if (OFF_RECTANGLE.contains(e.getX(), getY()));
      switchstate[j] = true;
     }
     paintStuff();
    }
   });
  }

  top.setBackground(Color.BLACK);
  bot.setBackground(Color.BLACK);

  for (int i = 0; i < switches.length; i++) {
   top.add(switches[i]);

  goToRoom = new JButton("Go to room", new ImageIcon("door_closed.jpg"));
  goToRoom.addActionListener(this);
  goToRoom.setRolloverIcon(new ImageIcon("door_open.jpg"));

  bot.add(goToRoom);

  card1.add(top, BorderLayout.CENTER);
  card1.add(bot, BorderLayout.SOUTH);
  }

 public void initCard2() {

  }
