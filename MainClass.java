import java.awt.Graphics;

import javax.swing.JFrame;

public class MainClass extends JFrame {

  public static void main(String[] a){
    MainClass f = new MainClass();
    f.setSize(300,300);
    f.setVisible(true);
  }
  
  
  public void paint(Graphics g) {
    g.drawArc(10, 40, 70, 70, 0, 75);
    g.fillArc(100, 40, 70, 70, 0, 75);
    g.drawArc(10, 100, 70, 80, 0, 175);
    g.fillArc(100, 100, 70, 90, 0, 270);
    g.drawArc(200, 80, 80, 80, 0, 180);
  }
}
