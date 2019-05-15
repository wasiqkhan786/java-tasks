import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import javax.swing.*;
public class Assign extends JFrame{
     int xp=460,yp=460,xpos=100,ypos=100;   
     
     public static void main(String[]args){
         Assign jf=new Assign();
        JPanel jp=new JPanel();
       jf.add(jp);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setBounds(0,0,480,480);
       jf.setVisible(true);
     }
    public void paint(Graphics g){
        super.paint(g);     
  Graphics2D g2d=(Graphics2D) g;
     g2d.setColor(Color.yellow);
       g2d.fill(new Arc2D.Double(xpos,ypos,35,45,35,315,Arc2D.PIE));
    
             xpos++;
              g2d.fill(new Arc2D.Double(xpos,ypos,35,45,35,315,Arc2D.PIE));     
               if(xpos>=xp){
                          xpos--;
                             g2d.fill(new Arc2D.Double(xpos,ypos,35,45,35,315,Arc2D.PIE));
                           }
                   
   
                       try{
		         Thread.sleep(6);
			          }
		           catch(Exception e){}
		          repaint(10); 
                       








   } 
 }
 
