// Ahad Mahmood BESE-4A Reg #4650 , All of the code is mine nothing has been copied from anywhere
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
public class LabE extends JFrame {
        public static void main(String[]args){
           LabE lb=new LabE();
           lb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            String opt=JOptionPane.showInputDialog("What type of moon do you want to draw?\n"+
                                                       "Full\n"+
                                                        "Half\n"+"Crescent?\n");
              lb.setBackground(Color.RED);
                lb.setBounds(0,0,500,500);
                 lb.setVisible(true);
              switch(opt){
                case ("Full"):
                             Full fm =new Full();
                              lb.add(fm);
                              lb.setVisible(true);
                               break;
           case("Half"):                               
                        Half hf=new Half();
                      lb.add(hf);
                       lb.setVisible(true);
                       break;
            case("Crescent"):
                                 Cres ce=new Cres();
                                      lb.add(ce);
                                     lb.setVisible(true);
                               break;
                               default:
                                    JOptionPane.showMessageDialog(null,"You entered wrong choice","Option",JOptionPane.PLAIN_MESSAGE);   
                                  break;
                          }
                       }
}
class Full extends JPanel implements ActionListener{ 
                      int temp=0;
                     int temp2=0;
                          int xinc=420;
                        int xmid=230;
                     int  ymid=230;
                     int yinc=0;
  JButton jb=new JButton("Pause");
                       JButton jb2=new JButton("Resume");
                        JButton jb3=new JButton("Exit");
                      { jb.addActionListener(this);
                     jb2.addActionListener(this);
                      jb3.addActionListener(this);
                    add(jb); add(jb2); add(jb3);  
                    }
public void paintComponent(Graphics g){
                    super.paintComponent(g);
                   Graphics2D g2d=(Graphics2D) g;
                    g2d.setPaint(Color.YELLOW);
                    g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                    if (xinc>0){
                        xinc--;
                        g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));   
                                }
                    else {   if(xinc<=0){
                                      xinc=230;
                                       ymid=460;
                                     g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                               }          if(ymid>0){
                                                          ymid--;   
                                                               g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                                                          } 
                                                  else{         if(ymid<=0){
                                                                           xinc=xmid;
                                                                 yinc=ymid;
                                                                       g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                                                                                       } 
                                                          }
                          } 
                                                   try{
			         Thread.sleep(6);
			          }
		           catch(Exception e){}
		          repaint(10); 

                                       
                        }  
                        
 public void actionPerformed (ActionEvent ae){
                  String s=ae.getActionCommand();
                    switch(s){
                         case ("Pause"):
                                        temp=xinc;
                                          temp2=ymid;
                                         xinc=0;
                                          ymid=0;
                                          break;
                        case("Resume"):
                              xinc=temp;
                              ymid=temp2;
                            break;
                   case("Exit"):
                                     System.exit(1);
                              break;
                    default:
                         JOptionPane.showMessageDialog(null,"Wrong Choice Entered","Choice",JOptionPane.PLAIN_MESSAGE);
                              }
}    
}
 class Half extends JPanel implements ActionListener{
                 int temp=0;
                     int temp2=0;
                 JButton jb=new JButton("Pause");
                       JButton jb2=new JButton("Resume");
                        JButton jb3=new JButton("Exit");
                      { jb.addActionListener(this);
                     jb2.addActionListener(this);
                      jb3.addActionListener(this);
                    add(jb); add(jb2); add(jb3);  
                    }
                      int xpos=460; 
                       int ypos=460;
                      int xinc=420;
                        int xmid=230;
                       int ymid=230;
                     int yinc=0;
public void paintComponent(Graphics g){
                 
                 Graphics2D g2d=(Graphics2D) g;
                    g2d.setPaint(Color.YELLOW);
                    g2d.fill(new Arc2D.Double(xinc,ymid,60,60,90,180,Arc2D.CHORD));
                             if (xinc>0){
                        xinc--;
                        g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));   
                                }
                    else {   if(xinc<=0){
                                      xinc=230;
                                       ymid=460;
                                     g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                               }          if(ymid>0){
                                                          ymid--;   
                                                               g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                                                          } 
                                                  else{         if(ymid<=0){
                                                                           xinc=xmid;
                                                                 yinc=ymid;
                                                                       g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                                                                                       } 
                                                          }
                          } 
                                                   try{
			         Thread.sleep(6);
			          }
		           catch(Exception e){}
		          repaint(10);                  


                                                                } 
           
 public void actionPerformed (ActionEvent ae){
                  String s=ae.getActionCommand();
                    switch(s){
                         case ("Pause"):
                                        temp=xinc;
                                          temp2=yinc;
                                          break;
                        case("Resume"):
                              xinc=temp;
                              yinc=temp;
                             break;
                   case("Exit"):
                                     System.exit(1);
                              break;
                    default:
                         JOptionPane.showMessageDialog(null,"Wrong Choice Entered","Choice",JOptionPane.PLAIN_MESSAGE);
                              }
}    
}
class Cres extends JPanel implements ActionListener{
                          int temp=0;
                     int temp2=0;
                       JButton jb=new JButton("Pause");
                       JButton jb2=new JButton("Resume");
                        JButton jb3=new JButton("Exit");
                      { jb.addActionListener(this);
                     jb2.addActionListener(this);
                      jb3.addActionListener(this);
                    add(jb); add(jb2); add(jb3);  
                    }
                     int xpos=460; 
                       int ypos=460;
                      int xinc=420;
                        int xmid=230;
                       int ymid=230;
                     int yinc=0;
public void paintComponent(Graphics g){
                
                 Graphics2D g2d=(Graphics2D) g;
                    g2d.setPaint(Color.YELLOW);
                    g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
               g2d.setPaint(Color.RED);
                      g2d.fill(new Arc2D.Double(xinc+15,ymid+10,60,60,0,360,Arc2D.PIE)); 
                                              }    
 if (xinc>0){
                        xinc--;
                        g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));   
                               g2d.fill(new Arc2D.Double(xinc+15,ymid+10,60,60,0,360,Arc2D.PIE));   }
                    else {   if(xinc<=0){
                                      xinc=230;
                                       ymid=460;
                                     g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                             g2d.fill(new Arc2D.Double(xinc+15,ymid+10,60,60,0,360,Arc2D.PIE));    }          if(ymid>0){
                                                          ymid--;   
                                                               g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                                                         g2d.fill(new Arc2D.Double(xinc+15,ymid+10,60,60,0,360,Arc2D.PIE));   } 
                                                  else{         if(ymid<=0){
                                                                           xinc=xmid;
                                                                 yinc=ymid;
                                                                       g2d.fill(new Arc2D.Double(xinc,ymid,60,60,0,360,Arc2D.PIE));
                                                                                g2d.fill(new Arc2D.Double(xinc+15,ymid+10,60,60,0,360,Arc2D.PIE));         } 
                                                          }
                          } 
                                                   try{
			         Thread.sleep(6);
			          }
		           catch(Exception e){}
		          repaint(10);              
          

 public void actionPerformed (ActionEvent ae){
                  String s=ae.getActionCommand();
                    switch(s){
                         case ("Pause"):
                                        temp=xinc;
                                          temp2=yinc;
                                    xinc=0;
                                  yinc=0;
                                          break;
                        case("Resume"):
                              xinc=temp;
                              yinc=temp;
                             break;
                   case("Exit"):
                                     System.exit(1);
                              break;
                    default:
                         JOptionPane.showMessageDialog(null,"Wrong Choice Entered","Choice",JOptionPane.PLAIN_MESSAGE);
                              }
}  
}  