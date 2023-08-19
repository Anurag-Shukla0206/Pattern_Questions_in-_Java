import java.util.Scanner;

public class Ques_20 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();
            int spc = n/2;
            int str = 1;

            for(int i=1;i<=n;i++){
                
                if(i<=n/2+1){
                    for(int j=spc;j>=1;j--){
                        System.out.print(" ");
                    }
                    for(int j=str;j<=str;j++){
                        System.out.print("*");
                    }

                    for(int j=1;j<i*2-1;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<(n/2)-i;j++){
                        System.out.print("*");
                    }
                    
                    spc--;
                }
                else{
                    spc++;
                    for(int j=1;j<=spc;j++){
                        System.out.print(" ");
                    }
                    for(int j=str;j<=str;j++){
                        System.out.print("*");
                    }
                    
                }
            System.out.println();

            }



            

            scn.close();
            }
}
