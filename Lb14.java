//I "Ahad Mahmood" do verify that the submitted code is my own effort and that I have not copied it from any peer or 
//any internet source that has not been acknowledged. I also understand that if my submission fails the similarity 
//detection, I would be awarded zero marks not only for this submission but the whole evaluation component.
//import static java.nio.file.StandardOpenOption.*;
//importing required libraries
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.io.File;
import java.nio.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.awt.event.*;
import javax.swing.event.*;
public class Lb14 extends JFrame {
    public static void main(String[]args) throws Exception{
         Lb14 lb = new Lb14();
         Jp jp = new Jp();  //object of panel class
         lb.add(jp);
         lb.setBounds(0,0,500,500);
         lb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         lb.setVisible(true);
         }  //main ends
} //class Lb14 ends
class Jp extends JPanel implements MouseListener{
     Lb14 lb= new Lb14();
     JTextField tf;
     JTextArea ta;
     JButton jb1;
     JButton jb2;
     JButton jb3;
     FileInputStream fis; //creating fileinputstream object
     Jp() throws Exception{
            setLayout(null);
            tf = new JTextField();
            ta = new JTextArea();
            tf.setBounds(0,0,500,20);
            add(tf);
            jb1 = new JButton("Standard mode");
            jb2 = new JButton("NIO");
            jb3 = new JButton("NIO2");
            jb1.setBounds(100,30,150,40);
            jb2.setBounds(250,30,80,40); 
            jb3.setBounds(330,30,80,40);
            add(jb1); add(jb2); add(jb3);   //adding buttons
            ta.setBounds(0,100,500,400);
            JScrollPane sp = new JScrollPane(ta);
            sp.setBounds(0,80,500,420);
            add(sp);
            jb1.addMouseListener(this); jb2.addMouseListener(this); jb3.addMouseListener(this);//activating mouselistener on buttons
            }  //constructor ends
                            
public void mouseClicked(MouseEvent me){
        Object opt = me.getSource();  //getting type of object
        float t1=0;
        float t2=0;
        float tff=0;
        File ff = new File("hello.txt");
           //for jb1 = "Standard mode of io";
            if ( opt==jb1 ){
                  ta.setText(null);   //setting text of textarea to null
            try{
           		  fis = new FileInputStream(ff);
             	} catch (Exception e){}
            if(ff.exists()){
              		byte b[]= new byte [(int) ff.length()]; //creating byte array of file's length
            try{    t1 = System.currentTimeMillis();  //getting time of system before loading file
                    System.out.println(""+t1);
            		fis.read(b);    //reading file
                    t2 = System.currentTimeMillis(); //time of system after loading file
                    System.out.println(""+t2);
                }   catch (Exception e){}                 
            for (int i=0;i<b.length;i++){
                    ta.append(""+(char)b[i]);  //changing text of textarea to file
                   	                     }   
                         }   
                    tff = t2-t1;
                    System.out.println(""+tff);
                    tf.setText(""+tff);        //changing text of textfield to time required to read file
                                          }
                                         // for jb2= "nio mode" 
            if (opt==jb2){
                    ta.setText("");                
                    FileSystem fs = FileSystems.getDefault(); //converting to filesystem class
                    Path path = fs.getPath("hello.txt");   
            try{   
                    BufferedInputStream bis = new BufferedInputStream(Files.newInputStream(path)); //bufferedinputstream
                    char ch[] = new char[(int) ff.length()]; //character array in size of files length
                    t1 = System.currentTimeMillis();
                    System.out.println(""+t1);
            for (int i=0;i<ch.length;i++){
                    ch[i] = (char)bis.read();  //reading file in terms of characters
                                        }
                    t2 = System.currentTimeMillis();
                    System.out.println(""+t2);
            for (int i=0;i<ch.length;i++){ 
                    ta.append(""+ch[i]);   //changing text of textarea to file
                                         }  
                    tff = t2-t1;
                    System.out.println(""+tff);
                    tf.setText(""+tff);    
                }   catch (Exception e){}
                    
                            }

            if(opt==jb3){
                    ta.setText("");
                    Path path = Paths.get("hello.txt");
                    ByteBuffer bf = ByteBuffer.allocate(1024000);  //creating bytebuffer for file's size
            try{
                    ReadableByteChannel rch = Files.newByteChannel(path);  //creating readablebytechannel
                    rch.read(bf);
                    bf.flip(); //clearing buffer to read
                    byte b[]= new byte[bf.remaining()]; //creating byte array from bufferbyte
                    bf.get(b);
                    t1 = System.currentTimeMillis();
                    System.out.println(""+t1);
                    t2 = System.currentTimeMillis();
                    System.out.println(""+t2); 
                    tff = t2-t1;
                    tf.setText(""+tff);
                    System.out.println(""+tff);    
                    char ch[] = new char[((int)b.length)*2];
                    for (int i=0;i<ch.length;i++){
                    ch[i] = (char)b[i];             //getting character array from byte array
                                                }
                    for(int k=0;k<ch.length;k++){
                    ta.append(""+ch[k]);         //changing text of textarea to file 
                                            }
                    
                 } catch(Exception e){}
            }


            
}  //method mouseClicked ends         
            //null implementation for unused methods of interface 
public void mouseEntered(MouseEvent me){}   
public void mouseExited(MouseEvent me){}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
            
}//class Jp ends
                                    



