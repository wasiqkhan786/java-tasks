import java.util.*;
public class OCTDEC{
                   public static void main (String[]args){
                          int rem[]=new int[20];
                           int i=0;
                           int l=0;
                             int dec=0;
                        int pow=8;
                            int flag=0;
                         Scanner keybd=new Scanner(System.in);
                           System.out.println("Enter any positive octal number : ");
                            int n=keybd.nextInt();
                              while(n>10){
                          rem[i]=n%10;
                          n=n/10;
                           i++;
                                   }
                         rem[i]=n;
                for (int k=0;k<=i;k++){
                         if(rem[k]>7){
                         System.out.println("This is not a valid number");
                              } 
                        }  
                              dec=rem[0]+(rem[1]*8);
                                 for(l=i;l>1;l--){
                                           for(int m=1;m<=l;m++){
                                              rem[l]=rem[l]*8;
                                }  dec=dec+rem[l];
                                         }
                       System.out.println("Decimal number is "+ dec);
                                   }
                     }
                          
                                        