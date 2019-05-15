//I "Ahad Mahmood" do verify that the submitted code is my own effort and that I have not copied it from any peer or 
//any internet source that has not been acknowledged. I also understand that if my submission fails the similarity 
//detection, I would be awarded zero marks not only for this submission but the whole evaluation component.
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
public class Lb13 extends JFrame {
        public static void main(String[]args) throws IOException{ 
         Jp jp=new Jp();
         Lb13  jf=new Lb13();
         jf.add(jp);          
        jf.setBounds(0,0,500,500);
         jf.setTitle("File Handling");
         jf.setResizable(false);
         jf.setVisible(true);
         jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              } 
  }   
class Jp extends JPanel{
               Lb13 lb=new Lb13();
               JTextField tf;
             Lb13 jf=new Lb13();
             JTextArea ta;
             File ff ;
            public String x=null;
           Jp() throws IOException {
                 setLayout(new BorderLayout());        
                 tf =new JTextField();
                 ta=new JTextArea(); 
                 add(tf,"North");
                 JScrollPane jsp=new JScrollPane(ta);
                 add(jsp);
                 ff =new File("C:/Users/Asad/Desktop/Lb13.java");
               FileInputStream fis  = new FileInputStream(ff);
            if( ff.exists()){
                byte[] b=new byte[(int) ff.length()];
                String s=Jp.class.getName();
                fis.read(b);
              String directory="C:/";
              
              String path=  findFile(s+".class",new File(directory));
                for(int i=0;i<b.length;i++){
                       ta.append(""+(char)b[i]);
                      
                      tf.setText(path);
               } 
}  
else {
                  System.out.println("File not found");
         }      
  }
public String findFile(String name,File file) throws IOException
    {   
         String m="Yo";
        File[] list = file.listFiles();
        if(list!=null)
        for (File fil : list)
          { // System.out.println(fil);
            if (fil.isDirectory())
            {     
                   findFile(name,fil); 
               }   
                             
            else {  if (fil.getName().equals(name)){
                  System.out.println(fil.getAbsolutePath());
                   x=fil.getPath();
                    return x;
                     } 
                       }
            
          }
         
              return m;
}




 
 }
