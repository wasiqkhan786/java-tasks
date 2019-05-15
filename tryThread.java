import java.util.*;
import java.io.IOException;
public class tryThread extends Thread{
   
      String firstname;
      String secondname;
      long aWhile;

tryThread(String fName,String sName,long delay){

firstname= fName;
secondname= sName;
aWhile= delay;
setDaemon(true);
}
   public static void main(String[]args){
		Thread first = new tryThread("OOP","TOO HARD",200L);
   		Thread second = new tryThread("DLD","VeryHard",300L);
 		Thread third = new tryThread("Grades","SUNK",500L);
		System.out.println("Press Enter to return");
		first.start(); second.start(); third.start();
	try{		
		System.in.read();
  		System.out.println("Enter Pressed");
	   }
	catch (Exception e){
		}System.out.println("Ending main method");
      	return ;
 				
    } 
 @Override 
  public void run(){
	try{
		while(true){
			System.out.println(firstname);
			sleep(aWhile);	
			System.out.println(secondname);
			} 
	} catch (InterruptedException e){
			System.out.println(firstname + secondname + e);
					}
} //run ends
 
}//clas tryThread ends
       