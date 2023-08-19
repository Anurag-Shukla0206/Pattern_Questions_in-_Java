import java.util.Scanner;

public class Ques_27 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();
            
            int str = 1;

            for(int i=1;i<=n;i++){
                
                for(int j=n-i;j>=1;j--){
                    System.out.print("  ");
                }
              
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }

                for(int j=str/2;j>=1;j--){
                    System.out.print(j+" ");
                }

                str+=2;

                System.out.println();

            }

            scn.close();
}
}
