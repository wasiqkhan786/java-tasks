/*
<applet code="Pacs" width=400 height=300>
</applet>
*/
//This code is all mine, nothing has been copied from anywhere ,Ahad Mahmood BESE-4A 4650//


import java.awt.*;
import java.applet.*;
public class Pacs extends Applet
{  int yp=0; int xp=0;
int xpos=0; int ypos=0; int ymin=0;

int xtop=370; int ytop=270;
Color color;
 public void init(){
color =Color.red;
}
/*public Color gencol(){
      return new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
}*/


public void paint(Graphics g){ 
                             
                      
                     if(ypos<ytop)
                     {                  //dwn
                            ypos++;
                     g.fillArc(xpos,ypos,30,30,285,315);
                     } 
                     
                     else if(ypos>=ytop){
                          if(xpos<xtop){      //right
                                  yp=ypos;
                                 xpos++;
                              g.fillArc(xpos,ypos,30,30,30,315);
                           } 
                           else if(xpos>=xtop){ 
                           //  yp--;      
                          //  g.fillArc(xpos,yp,30,30,105,295);
                            // ye nechay if men ana tha
                             if(yp>0){
                              yp--;      
                            g.fillArc(xpos,yp,30,30,105,300);
                                   //yp--;  ye do dafa minus nae karna tha speed barh jae ge
                                   xp=xpos;
                               } 
                               else  if(yp==0){
                                    if(xp>=0){
                                        xp--;
                                        g.fillArc(xp,yp,30,30,195,295);
                                       } 
                                       else
                                        {
                                         //xp=xpos; yp=ypos; if ko pos say control kar rhay ho p say nae
                                          xpos=0; ypos=0;
                                       }
                                 }
                             }        
                      }                          
                 try{
			         Thread.sleep(6);
			          }
		           catch(Exception e){}
		          repaint(10); 
                       
                   
              }
          
         }