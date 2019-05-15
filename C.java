import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
public class C extends JFrame {
     static C c=new C();
    public static void main (String[]args){
      JButton jb=new JButton("Click me :D");
      jb.addMouseListener(new MouseAdapter(){
             public void mouseClicked(MouseEvent me){
                          System.exit(0);
                                                  } 
                                          }
                            );
     c.add(jb);
     c.setBounds(0,0,400,400);
     c.setVisible(true);
           } 
}
