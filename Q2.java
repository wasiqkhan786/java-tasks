import java.awt.*;

import javax.swing.*;

import javax.swing.event.*;

import java.awt.event.*;

import java.awt.geom.*;

import java.util.*;

public class Q2 extends JFrame {
    

public static void main (String []args){
    
  
Q2 q2=new Q2();
          

gpo jp=new gpo();
   
jp.addKeyListener(jp);
jp.setFocusable(true);

jp.setRequestFocusEnabled(true);      
jp.setLayout(null);          
         
 
q2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
 
q2.add(jp);
         
 
q2.setBounds(100,100,600,600);
        
  
q2.setVisible(true);
          
          
 
  
}

}




class gpo extends JPanel implements KeyListener{

int xinc=0; 

int yinc=0; 
     int xpos=0,ypos=180;

public void paintComponent(Graphics g){
      
        
  super.paintComponent(g);

Graphics2D g2d=(Graphics2D) g;
           

g2d.fill(new Rectangle2D.Double(300,180,10,180));
          

g2d.setPaint(Color.YELLOW);
           

g2d.fill(new Arc2D.Double(xinc,230,60,60,45,315,Arc2D.PIE));

if (xinc<230){
      xinc++;
       g2d.fill(new Arc2D.Double(xinc,230,60,60,45,315,Arc2D.PIE));

            }
else {if(xinc>=230)
             xinc--;
              g2d.fill(new Arc2D.Double(xinc,230,60,60,45,315,Arc2D.PIE));

                  }  
repaint(6);
          
 
}   

public void keyPressed(KeyEvent k){
                 
 int ke=k.getKeyCode();
                    
 if(ke==KeyEvent.VK_RIGHT)
    {                     
                            
      xinc++;;   
     repaint();

}  else {if(ke==KeyEvent.VK_LEFT)
    xinc--;
    repaint();}
}

public void keyTyped(KeyEvent k){}

public void keyReleased(KeyEvent k){}




}














































