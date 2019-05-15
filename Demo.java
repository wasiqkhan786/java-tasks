import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.geom.*;
public class Demo extends JFrame implements MouseListener,ActionListener {
    static  JLabel jb;
    static Demo dm =new Demo();
  public static void main(String[]args){
     JMenuBar mb=new JMenuBar();
     jb =new JLabel("Clicked");
     ButtonGroup bg=new ButtonGroup();
     JMenu mf1=new JMenu("File");
     JMenu mf2=new JMenu("Edit");
     JMenu mf3=new JMenu("Help");
     JMenu mf4=new JMenu("SubMenu");
     JMenuItem mi1=new JMenuItem("Open");
     JMenuItem mi2=new JMenuItem("Close");
     JMenuItem mi3=new JMenuItem("Exit"); 
     JMenuItem mi4=new JMenuItem("First");
     JMenuItem mi5=new JMenuItem("Second");
     mi1.addActionListener(dm); 
     mi3.addActionListener(dm);
     JCheckBoxMenuItem mcb=new JCheckBoxMenuItem("Check1");
     JCheckBoxMenuItem mcb2=new JCheckBoxMenuItem("Check2"); 
     mf1.add(mi1); mf1.add(mi2); mf1.add(mf4); mf4.add(mi4); mf4.add(mi5); bg.add(mcb); bg.add(mcb2);
     mf1.add(mi3);  mf2.add(mcb); mf2.add(mcb2);
     mb.add(mf1); mb.add(mf2);  mb.add(mf3);
     dm.setJMenuBar(mb);  
     dm.add(jb);
     dm.setBounds(0,0,500,500);
     dm.setVisible(true);
            
    } 
public void actionPerformed(ActionEvent ae){
               String e=ae.getActionCommand();
                 if(e.equals("Open")){
               jb.setText("You Clicked OPEN");
                   }  
                       else { System.exit(0);
                 }
                                      }
public void mouseClicked(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseExited(MouseEvent me){}
 }
    
       
