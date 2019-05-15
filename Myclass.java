import java.util.*;
import java.awt.*;
import javax.swing.*;
public class MyFrame extends JFrame{
       public static void main(String[]args){
       MyFrame mf=new MyFrame();
      JPanel jp=new JPanel();
       jp.setBackground(Color.red);
      mf.add(jp);
       mf.setBounds(100,100,400,400);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mf.setVisible(true);
    }  
 }
