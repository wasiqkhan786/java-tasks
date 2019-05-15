import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class Backg extends JFrame{
      public static void main(String[]args){
          Color color;
          JPanel j=new JPanel();
          j.setBackground(gencol());
          JPanel j2=new JPanel();
          j2.setBackground(gencol());
           JPanel j3=new JPanel();
          j3.setBackground(gencol());
          JPanel j4=new JPanel();
          j4.setBackground(gencol());
          JPanel j5=new JPanel();
          j5.setBackground(gencol());
          JPanel j6=new JPanel();
          JFrame mf=new JFrame(); 
          j6.setBackground(gencol1());
           mf.add(j);
          mf.add(j2);
          mf.add(j3);
          mf.add(j4);
         mf.add(j5); 
         mf.add(j6);
          mf.setLayout(new GridLayout(6,0));
           mf.setBounds(0,0,1366,768);
          mf.setVisible(true);
           }  
         static public Color gencol(){
            return new Color(90,151,206);
             }     
   static public Color gencol1(){
            return new Color(100,28,0);
}

class Obs extends JPanel{
      public void paintComponent(Graphics g){
         g.setColor(Color.red);
         g.fillArc(200,200,100,100,45,315);
      }   
  }  
  


}             
  













       
         
