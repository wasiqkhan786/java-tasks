//I "Ahad Mahmood" do verify that the submitted code is my own effort and that I have not copied it from any peer or any internet source that has not been acknowledged. I also understand that if my submission fails the similarity detection, I would be awarded zero marks not only for this submission but the whole evaluation component.
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.util.*;
public class Asgn extends JFrame implements MouseListener,ActionListener{
     static JButton jb1,jb2;  //declaring JButtons
     static  Asgn jf=new Asgn();  //creating oject of class
     static JLabel lb;
     public static void main(String[]args){
            JPanel jp=new JPanel();
            lb=new JLabel("Do you like your OOP Instructor?"); 
            jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
            jp.setLayout(null);
            jb1=new JButton("No");
            jb2=new JButton("Yes");
            lb.setBounds(120,100,250,20);
            jb1.setBounds(220,160,70,30);
            jb2.setBounds(135,160,70,30);
           { jp.add(lb);            //nonstatic initialization block to add buttons and label
            jp.add(jb1);
            jp.add(jb2);
            jf.add(jp);
            jb1.addMouseListener(jf);  //adding mouselistener to buttons
            jb2.addActionListener(jf);
            }
            jf.setBounds(0,0,500,500);
            jf.setVisible(true);
             


}//main ends 
public void mouseEntered(MouseEvent ae){
                     Random n= new Random(); //calling random function
                     int dig = n.nextInt(440-40)+40;
                     jb1.setBounds(dig,dig,70,30);   //setting bounds of button
                                        }
public void actionPerformed(ActionEvent ae){
              String sa=ae.getActionCommand();  //getting actioncommand
            if(sa.equals("Yes")){
                    lb.setText("I know that too");  //changing text of button
                                } 
            else{} 
                                       } //null body implementation for other
public void mouseExited(MouseEvent ae){}
public void mouseReleased(MouseEvent ae){}
public void mousePressed(MouseEvent ae){}
public void mouseClicked(MouseEvent ae){}

}// class Asgn ends


