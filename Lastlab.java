/* I "Ahad Mahmood" do verify that the submitted code is my own effort and that I have not copied it 
from any peer or any internet source that has not been acknowledged. I also understand that if my 
submission fails the similarity detection, I would be awarded zero marks not only for this submission 
but the whole evaluation component. */
import java.util.*;
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.io.IOException;
import java.lang.Thread;
public class Lastlab extends JFrame {
		public static void main(String[]args){
			
			Movep mp = new Movep();	//object of panel class
			Lastlab lb = new Lastlab();
			lb.add(mp);
			Thread first = new Thread(mp);
			Thread second = new Thread(mp);
			first.start();
			second.start();
			lb.setBounds(0,0,400,400);
			lb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			lb.setResizable(false);
			lb.setVisible(true);
		
		}//main ends
	}//main class ends
				//class for paint and thread
class Movep extends JPanel implements Runnable{	
	public static 	int xinc [] = {1,-1};
	public static 	int yinc [] = {-1,1};
	public static	int xpos=22 ,ypos=50; 
	public static	int xpos2=30,ypos2=60;
	public static	int xtop=20, ytop=20; 
	public static	int xbot=370, ybot=270; 
		Color color;
		
		//method to generate random color
	public Color genColor() {
		return new Color((float)Math.random(),(float)Math.random(),(float)Math.random()); 
}
		
		Movep(){
		System.out.println("Hello");
			

		}
		
	
				//Method to paint ball
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(color);
		g2d.fillOval(xpos,ypos,25,25);  //first ball
		
		color=genColor();
		g2d.setColor(color);
		g2d.fillOval(xpos2,ypos2,25,25); //second ball
		 try{
              Thread.sleep(300);
          } catch(Exception e){}
			
		
	} //paint ends here
				//implementing run method
	public void run(){
		
		String s = Thread.currentThread().getName();  //getting name of current running thread
		System.out.println(s);
		while (true){
		
		if (s.equals("Thread-1")){
		if (this.xpos>=this.xbot){   color=genColor(); this.xinc[0]= -1; }
		else if(this.xpos<=this.xtop) { color=genColor(); this.xinc[0]=1; }
		if (this.ypos>=this.ybot) { color=genColor(); this.yinc[0]=-1;  }
		else if(this.ypos<=this.ytop) { color=genColor(); this.yinc[0]=1; }
		this.xpos+=this.xinc[0]; this.ypos+=this.yinc[0];
		
       repaint(300); 
          } 

   

	if (s.equals("Thread-2")){	
			
		
		if (this.xpos2>=xbot){   color=genColor(); this.xinc[1]= -1; }
		else if(this.xpos2<=xtop) { color=genColor(); this.xinc[1]=1; }
		if (this.ypos2>=ybot) { color=genColor(); this.yinc[1]=-1;  }
		else if(this.ypos2<=ytop) { color=genColor(); this.yinc[1]=1; }
		this.xpos2+=xinc[1]; this.ypos2+=yinc[1];
		
               repaint(300);
              }
               }
        

	}//run ends
}//panel class ends 


