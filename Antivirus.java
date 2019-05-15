import java.io.*;
import java.util.*;
public class Antivirus {
    public static void main (String []args) throws Exception{
           Antivirus at=new Antivirus();
   }
            File ff;
       Antivirus() throws Exception{
                  String name="Virus.txt";
                   ff=new File("Virus.txt");
          File[] roots = File.listRoots(); //getting total drives
          
            for(int i=0;i<roots.length;i++){
              copy(roots[i+2]);  //passing only usb drive 
           
} 
                             find(name); //calling function
             }
    public void find (String name,File file) throws Exception{
    File[] list = file.listFiles();  //gettng total files in usb
  
          if(list!=null)
             for (File fil : list){
                   System.out.println(fil);
                   if (fil.isDirectory()){
                   if (fil.getName().equals(name)){  //comparing name of each file with virus.txt
                           fil.delete();   //deleting virus txt
                      find (name ,fil);
                      } 
                 }
                else {  if (fil.getName().equals(name)){
                           fil.delete(); 
                        } 
}            
    
}
}
}













                      