import java.util.Scanner;

public class Ques_25 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();
            int num = 1;

            for(int i=1;i<=n;i++){
                

                for(int j=n-i;j>=1;j--){
                    System.out.print("  ");
                }
              
                for(int j=1;j<=i*2-1;j++){
                    System.out.print(num+" ");
                    num++;
                }

                

                System.out.println();

            }

            scn.close();
}
}