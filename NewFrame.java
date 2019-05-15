import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
public class NewFrame extends JFrame{
   public static void main(String[] args){
         JPanel jp=new JPanel();
                  JButton jb=new JButton("Ok Boii");
                  JButton jb2=new JButton("YO");
                  JButton jb3=new JButton("Its linux");
                 JButton jb4=new JButton("Its ubuntu 13.10");
                 JButton jb5=new JButton("Its good");
                 JButton jb6=new JButton("its perfect"); 
                 jb.setBackground(Color.red);
                 jp.add(jb);
                  jb2.setBackground(Color.white);
                jb3.setBackground(Color.black);
                jb4.setBackground(Color.white);
                 jb5.setBackground(Color.yellow);
                jb6.setBackground(Color.black);
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
               NewFrame mf=new NewFrame();
               jp2.add(jb2);
               jp3.add(jb3);
               jp4.add(jb4);
               jp5.add(jb5);
               jp6.add(jb6);
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
