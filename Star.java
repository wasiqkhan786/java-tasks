/*
<applet code="Star" width=400 height=400>
</applet>
*/
import java.awt.*;
import java.applet.*;
public class Star extends Applet{
   int xmax=380;
  int ymax=380;
  int xpos=150; int ypos=150;
   int oang=285; int cang=45;
  String s="Hello";
int xc=100; int yc=ypos;
 int i=0;
   Color color;
public void init(){
color=Color.red;
}
 public Color gencol(){
      return new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
}public void paint(Graphics g){
          g.drawString(s,xc,yc);
       g.setColor(gencol());
        /*g.fillArc(xpos,ypos,60,60,oang,cang);*/ 
        oang+=2;   
               
                     /*g.fillArc(xpos,ypos,100,100,oang,cang);*/ 
           
           g.fillArc(xpos,ypos,200,200,oang,cang); 
            if(xc>=xmax){
                        xc--; 
                   g.drawString(s,xc,yc);
                                  } else{
                                   g.drawString(s,xc,yc);
                                  
                                } 
                                     xc++;

           
             try{    
	           
                             Thread.sleep(5);
                                                      }
                                          
		           catch(Exception e){}
		          repaint(5); 
                      





                                                }
 }






  
           
