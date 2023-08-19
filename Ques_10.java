import java.util.Scanner;

public class Ques_10 {
     public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            


            for(int i=n;i>=1;i--){

                for(int j=0;j<n-i;j++){
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
