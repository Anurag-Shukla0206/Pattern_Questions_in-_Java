import java.util.Scanner;

public class Ques_15 {
     public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            for(int i=1;i<=n;i++){
                for(int j=1;j<=i*2-2;j++){
                    System.out.print("  ");
                }
                for(int j=i;j<=n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            
            for(int i=2;i<=n;i++){
                for(int j=(n-i)*2;j>=1;j--){
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



// .....
//   ....
//     ...     
//       ..
//         .
//       ..
//     ...
//   ....
// .....

