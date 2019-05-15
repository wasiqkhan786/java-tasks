import java.awt.*;
import javax.swing.*;
public class Frame extends JFrame{
     static Color cl=new Color(100,100,100);
    public static void main(String[]args){
         Frame mf=new Frame();
           JPanel jp=new JPanel();
             jp.setBackground(JColorChooser.showDialog(null,"Choose a color: ",cl));
             mf.add(jp);
             mf.setBounds(100,100,600,600);
             mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mf.setVisible(true);
              }
}             