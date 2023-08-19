import java.util.Scanner;

public class Ques_19 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            int star =n;
            int space=1;
            for(int i=1;i<=n;i++){
   
               if(i==1 || i==n){
   
                  for(int j=1;j<=n;j++){
                   System.out.print("* ");
                 }
               }
   
               else{
   
              
              for(int j=1;j<=star/2;j++){
                   System.out.print("* ");
               }
               for(int j=1;j<=space;j++){
                   System.out.print("  ");
               }
                 for(int j=1;j<=star/2;j++){
                   System.out.print("* ");
               }
               if(i<=n/2){
                  star-=2;
                  space+=2;
                }
              else{
                 star+=2;
                 space-=2;
              }
           }
         System.out.println();
       }



            

            scn.close();
            }
}
