import java.util.*;
public class Conversion{
        public static void main(String[]args){
                    Scanner keybd=new Scanner(System.in);
                   int choice=0;
                    System.out.println("Press 1 to convert decimal to binary\n"+
                                                "Press 2 to convert decimal to octal\n");
                   choice=keybd.nextInt();
                  Conversion conv=new Conversion();
                     switch(choice){
                       case 1:
                              conv.ToBinary(choice);
                             break;
                         
             default:
                   System.out.println("Wrong choice entered");
         } 
}
     void ToBinary(int choice){
                            int rem[]=new int[20];
                           String digit;
                         System.out.println("Enter a valid decimal number:");
                      Scanner keybd=new Scanner(System.in);
                             digit=keybd.next();
                              char To_char[]=digit.toCharArray();
                                    int i=0;
                                   int count=0; 
                          int dec[]=new int[3];  
                       for(i=0;i<To_char.length;i++){
                         if(To_char[i]<'0' | To_char[i]>'9'){
                            System.out.println("Invalid digit found in decimal number:");
                                          }
                                     break;
                         } 
                        for(int p=0;p<To_char.length;p++){
                          dec[p]=Character.getNumericValue(To_char[p]);
                         
      }               for(int x=dec.length-1;x>=0;x--){
                           while(dec[x]>=2){
                               rem[i]=dec[x]%2;
                                dec[x]=dec[x]/2;
                                  count++;
                                    i++;  }
                                     rem[i]=dec[x];
                           } for(int k=count;k>=0;k--){
                                 System.out.print(rem[k]);
                                }

                             }                            

}
















                           