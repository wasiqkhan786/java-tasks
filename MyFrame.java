import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
class MyPanel extends JPanel implements ActionListener{
     JTextField src=new JTextField(25);
     
 JButton jb=new JButton(">>");
  JButton jb2=new JButton("<<");
  JTextField dst =new JTextField(25);
  { jb.addActionListener(this);
    jb2.addActionListener(this);
  add(src); add(jb); add(jb2); add(dst);  
     } 
   public void actionPerformed (ActionEvent ae){
            String s=ae.getActionCommand();
             String st=src.getText();
            String st2=dst.getText();
           if( s.equals(">>")){
                 dst.setText(st);
                   } else {  src.setText(st2);
                       }

      }
 }
public class MyFrame extends JFrame{
    public static void main(String[]args){
     MyFrame mf=new MyFrame();
     MyPanel mp=new MyPanel();
    mf.setLayout(new FlowLayout());
  mf.add(mp);
  mf.setBounds(100,100,800,800);
   mf.setVisible(true);
    }  
 }