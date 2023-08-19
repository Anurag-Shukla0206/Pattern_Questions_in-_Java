import java.util.Scanner;

public class Ques_29 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            
            

            for(int i=1;i<=n;i++){

                
                for(int j=n-i;j>=1;j--){
                    System.out.print("  ");
                }
                
                for(int j=1;j<=i*2-1;j++){
                    if(j==1 || j==i*2-1){
                        System.out.print(i+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }
                System.out.println();


            }

            scn.close();
}
}
