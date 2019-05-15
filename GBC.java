import java.awt.*;
import javax.swing.*;
import javax.swing.BoxLayout;
public class GBC extends JFrame{
    public static void main(String[]args){
     GBC gb=new GBC();
    JPanel jp=new JPanel();
    Box  h1=Box.createHorizontalBox();
     // jp.setLayout(new BoxLayout(jp,BoxLayout.X_AXIS));
    for(int i=0;i<3;i++){
           h1.add(Box.createHorizontalStrut(25));
           h1.add(new JButton("Button" + i));
         }
      gb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     gb.add(h1);
   gb.setBounds(0,0,500,500);
  gb.setVisible(true);
   }
}