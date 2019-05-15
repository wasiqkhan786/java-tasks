//I "Ahad Mahmood" do verify that the submitted code is my own effort and that 
//I have not copied it from any peer or any internet source that has not been
 //acknowledged. I also understand that if my submission fails the similarity detection, 
//I would be awarded zero marks not only for this submission but the whole evaluation component.

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.geom.*;
public class LabTask extends JFrame implements MouseListener{
	  static MyPanel mp;
   static JLabel jt= new JLabel("X=");
   static JLabel jt1= new JLabel("Y=");
public static void main(String[]args){
     mp=new MyPanel();
     LabTask lb=new LabTask();
      JPanel jp=new JPanel();  
    JPanel jp1=new JPanel();
    JPanel jp2=new JPanel();
   JPanel jp3=new JPanel();
   jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
   jp3.setLayout(new FlowLayout(FlowLayout.RIGHT)); 
   lb.add(jp1);
   jp2.add(jt);
   jp3.add(jt1);
   jp.add(jp2);
   jp.add(jp3);
   lb.add(jp,"South");
   lb.add(mp);
  jp1.requestFocus();
  jp1.setFocusable(true);
  jp1.grabFocus();
   { lb.addMouseListener(lb);
   } 
  lb.setBounds(0,0,500,500);
  lb.setVisible(true);
   } 
 
public void mouseEntered(MouseEvent me){}
public void mouseReleased(MouseEvent me){
                                mp.xst=me.getX();
                                mp.yst=me.getY();
                                repaint();        
 }
public void mouseClicked(MouseEvent me){
       
       float x=me.getX();
       float y=me.getY();
      jt.setText(""+x);
      jt1.setText(""+y);
       mp.xpos=me.getX();
                 mp.ypos=me.getY();
                 repaint();

     }
public void mousePressed(MouseEvent me){
                 
  }
public void mouseExited(MouseEvent me){
         }
}
class MyPanel extends JPanel{
     double xpos,ypos=-1,xst,yst;
public void paintComponent(Graphics g){
 super.paintComponent(g);
   Graphics2D g2d=(Graphics2D) g;
  g2d.setPaint(Color.red);
	if(ypos!=-1){
   g2d.draw(new Line2D.Double(xpos,ypos,xst,yst)); 
  }
  repaint();
   } 
 }






     