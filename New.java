import java.util.*;
public class New{
     public static void main(String[]args){
                   Scanner keybd=new Scanner(System.in);
                int choice=0;
          System.out.println("Press 1 to convert decimal to binary\n"+
                                        "Press 2 to convert deciaml to octal\n");
          choice =keybd.nextInt();
         New nb=new New();
              switch(choice){
                     case 1:
                       nb.ToBinary(choice);
                           break;
                       case 2:
                       nb.ToOctal(choice);
                            break;
               default:
                     System.out.println("wrong choice entered \n");
            } 
}      
     void ToBinary(int choice){
                       Scanner keybd=new Scanner(System.in);
                       int digit=0;
                    int rem[]=new int[20];
                   int rem1[]=new int[20];
                   int i=0;
                    int x=0;
                   int count=0;
                    int flag=0;
                          System.out.println("Enter a valid decimal number:");
                              digit=keybd.nextInt();
                         int copy=digit;   
                          while(copy>10){
                            rem[i]=copy%10;
                             copy=copy/10;
                                 i++;
               }     rem[i]=copy;
                                    while(digit>=2){
                                      rem1[x]=digit%2;
                                        digit=digit/2;
                                         x++;
                                          count++;
                                               }   rem1[x]=digit;
                                               for(int j=0;j<=i;j++){
                                                  if(rem[j]<0 || rem[j]>9){
                                                   System.out.println("Your digit has invalid number");
                                                    flag=1;
                                                   }
                                                    break;
                                                   } 
                                      if (flag==1){
                                                System.out.println("the program is exiting");
                                                } 
                                             else {
                                                   for(int k=count;k>=0;k--){
                                                       System.out.print(rem1[k]);
                                                            }  
                                                       } 
                                      } 
                void ToOctal(int choice){
                                        Scanner keybd=new Scanner(System.in);
                                       int rem[]=new int[20];
                                     int rem1[]=new int[20];
                                          int i=0;
                                         int x=0;
                                         int count=0;
                                               int flag=0;   
                                       int digit=0;
                                        System.out.println("Enter a valid decimal number:");
                                       digit=keybd.nextInt();
                                int copy=digit;   
                                   while(copy>10){
                            rem[i]=copy%10;
                             copy=copy/10;
                                 i++;
               }     rem[i]=copy;
                                    while(digit>=8){
                                      rem1[x]=digit%8;
                                        digit=digit/8;
                                         x++;
                                          count++;
                                               }   rem1[x]=digit;
                                               for(int j=0;j<=i;j++){
                                                  if(rem[j]<0 || rem[j]>9){
                                                   System.out.println("Your digit has invalid number");
                                                    flag=1;
                                                   }
                                                    break;
                                                   } 
                                      if (flag==1){
                                                System.out.println("the program is exiting");
                                                } 
                                             else {
                                                   for(int k=count;k>=0;k--){
                                                         
                                                             System.out.print(rem1[k]);
                                                                       
                                                                     }  
                                                       } 
                                      } 
}