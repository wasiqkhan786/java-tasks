/* I "Ahad Mahmood" do verify that the submitted code is my own effort and that I have not copied it 
from any peer or any internet source that has not been acknowledged. I also understand that if my 
submission fails the similarity detection, I would be awarded zero marks not only for this submission 
but the whole evaluation component. */
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class MoveBall extends JFrame
{ 
  public static void main(String[]args){
  MoveBall mb = new MoveBall();
  Ballp mp = new Ballp();
  mb.add(mp);
  mb.setBounds(0,0,400,300);
  mb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  mb.setVisible(true);
} 
}
class Ballp extends JPanel{
int xpos=10; int ypos=50; 
int xinc=2; int yinc=2;
int xtop=20; int ytop=20; 
int xbot=370; int ybot=270; 
Color color;
	


public Color genColor() {
return new Color((float)Math.random(),(float)Math.random(),(float)Math.random()); 
}

public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;	
         
		if (xpos>=xbot){   color=genColor(); xinc= -1; }
		else if(xpos<=xtop) { color=genColor(); xinc=1; }
		if (ypos>=ybot) { color=genColor(); yinc=-1;  }
		else if(ypos<=ytop) { color=genColor(); yinc=1; }
		xpos+=xinc; ypos+=yinc;
		g2d.setColor(color);
		g2d.fillOval(xpos,ypos,25,25);
		try{
			Thread.sleep(2);
		}
		catch(Exception e){}
		repaint(10); 
}//paint ends 

}//class ends

