import java.util.*;
public class ADD{
   public static void main (String[]args){
      String x="";
      String y="";    
   int res=0;
Scanner input=new Scanner(System.in);
 System.out.println("Enter your 1st number:");
     x=input.nextLine();
    int n1=Integer.parseInt(x);
    System.out.println("Enter your 2nd number :");
   y=input.nextLine();
                 int n2=Integer.parseInt(y);
            System.out.println("your first number = "+ n1);
               System.out.println("your second number= " + n2);
              res=n1+n2;
       System.out.println("Your result is " + res);
                  }
   }