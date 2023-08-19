import java.util.Scanner;

public class Ques_21 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            for(int i=1;i<=n;i++){
              
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }

                for(int j=(n*2)-(i*2)-1;j>=1;j--){
                    System.out.print("  ");
                }

                if(i==n){
                    for(int j=1;j<=i-1;j++){
                    System.out.print("* ");
                }
                }
                else{
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
            }

                System.out.println();

            }



            

            scn.close();
            }
}
