import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
public class MyFrames extends JFrame{
   public static void main(String[] args){
               JPanel jp=new JPanel();
                  JButton jb=new JButton("Ok Boii");
                   JButton jb2=new JButton("YO");
                 jb.setBackground(Color.red);
                  jp.add(jb);
                   jp.add(jb2);
              JPanel jp2=new JPanel();
             JPanel jp3=new JPanel();
               JPanel jp4=new JPanel();
              JPanel jp5=new JPanel();
              JPanel jp6=new JPanel();
              jp2.setBackground(Color.red);
              jp.setBackground(Color.yellow);
              jp3.setBackground(Color.blue);
              jp4.setBackground(Color.black);
                   jp5.setBackground(Color.green);
                  jp6.setBackground(Color.orange);
                 MyFrame mf=new MyFrame();
   mf.setLayout(new GridLayout(2,3));
   mf.add(jp);
 mf.add(jp2);
mf.add(jp3);
mf.add(jp4);
mf.add(jp5);
mf.add(jp6);
    mf.setBounds(100,100,400,400);
    mf.setVisible(true);
  }   
}
