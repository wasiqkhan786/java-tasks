import java.util.*;
public class Digits{
                   public static void main (String[]args){
                                   Scanner input=new Scanner(System.in);
                                       System.out.println(" Enter a number you want digits for : ");
                                  int number=input.nextInt();
                                    int rem=0;
                                       System.out.println(" digits are : ");
                                         while ( number >10){
                                                   rem=number%10;
                                                   number=number/10;
                                                     System.out.print(rem);
                                                         System.out.println("");
                                    }     
                                         System.out.println(number);                                                         
                                             }
                              }