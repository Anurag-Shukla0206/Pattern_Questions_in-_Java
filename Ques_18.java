import java.util.Scanner;

public class Ques_18 {
     public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            for(int i=1;i<=n/2+1;i++){
                for(int j=n-i;j>=1;j--){
                    System.out.print("  ");
                }
                
                for(int j=1;j<i*2;j++){
                    System.out.print("* ");
                }
            System.out.println();    
        }
        
            for(int i=n/2;i>=1;i--){
               
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }

                for(int j=i*2-1;j>=1;j--){
                    System.out.print("* ");
                }

                System.out.println();
            }

            scn.close();
            }

    
}
