/*All of the work done is mine and nothing has been copied form anywhere , Ahad Mahmood 4650 BESE 4A */


import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

class StarsPanel extends JPanel
{  int x=0;
  int i=0;
int[ ] xPoints = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
int[ ] yPoints = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
GeneralPath star = new GeneralPath( );

{
star.moveTo( 55,0);
for ( int count = 1; count < xPoints.length; count++ )
star.lineTo( xPoints[ count ], yPoints[ count ] );
star.closePath( );
  
}
public Color  genColors(){
   return new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
  }

public void paintComponent( Graphics g ) {
//super.paintComponent( g ); 
Graphics2D g2d = ( Graphics2D ) g;//casting 


g2d.translate(175,125);

g.setColor(genColors());
g2d.rotate(30+x);
g2d.fill( star );

try{
Thread.sleep(100);
}
catch(Exception e){ }
repaint(100);


x--;

}//paintComponent ends
}//class StarsPanel ends



public class Starg {  
public static void main( String [ ] args ) {
JFrame frame = new JFrame( "Drawing 2D Shapes" ); 
frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
StarsPanel sp = new StarsPanel( );
frame.add( sp ); 
frame.setBackground( Color.WHITE );
frame.setSize( 400, 400 ); 
frame.setVisible( true ); 
} // end main
} // end class Star
