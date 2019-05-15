import java.util.*;
public class Encryption{
             public static void main (String[]args){
                    Scanner input=new Scanner(System.in);
                     System.out.println(" Enter a 4 digit number : ");
                  int n=input.nextInt();
              int rem1,rem2,rem3,rem4=0; 
              int temp1,temp2=0;   
                     rem1=n%10;
                            n=n/10;
                        rem2=n%10;
                           n=n/10;
                 rem3=n%10;
                n=n/10;
                  rem4=n%10;
              temp1=rem4;
             rem4=rem1;
              rem1=temp1;
               rem4=(rem4*5)/7;
             temp2=rem3;
              rem3=rem2;
              rem2=temp2;
             rem2=(rem2*5)/7;
          System.out.println("Encrypten number is : ");
         System.out.println(rem1);
         System.out.println(rem2);
          System.out.println(rem3);
         System.out.println(rem4);
           }
}
                      