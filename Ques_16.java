import java.util.Scanner;

public class Ques_16 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print("  ");
                }
                for(int j=n;j>=i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }

            
            for(int i=2;i<=n;i++){
                for(int j=1;j<i;j++){
                    System.out.print("  ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }

                System.out.println();

            }

            scn.close();
            }

                
            
            
         
        }
        
    
