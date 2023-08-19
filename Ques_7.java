import java.util.Scanner;

public class Ques_7 {
     public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();
    
            for(int i=1;i<=n;i++){

                if(i==1 || i==n){
                    for(int j=1;j<=n;j++){
                        System.out.print("*\t");
                    }
                }
                else{

                    System.out.print("*");

                    for(int j=1;j<=n-1;j++){
                        System.out.print("\t");
                    }

                    System.out.print("*");

                }

                System.out.println();
                
               
            }
            scn.close();
        }
}
