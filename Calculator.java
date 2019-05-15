import java.util.*;
public class Calculator{
      public static void main(String[]args){
                         Scanner input=new Scanner(System.in);
                 System.out.println("Enter 1st number: ");      
                  int x=input.nextInt();
              int result=0;
                    System.out.println("Enter 2nd number:");
                       int y=input.nextInt();
                     System.out.println(" Press 1 to add-"+
                                                  "Press 2 to subtract-"+
                                                  "Press 3 to multiply-"+
                                                  "Press 4 to divide-");
                              int choice=input.nextInt();
                              switch(choice){
        case 1:
                       result= x+y;
                        break;      
          case 2:
                       result=x-y;
                        break;
             case 3:
                         result=x*y;
                           break;
                case 4:
                             result=x/y;
                              break;
                       default:
                                    System.out.println(" Enter any of the above ");
                             }  
                              System.out.println(" Result is = "+ result);
                                                                    }
 }
   