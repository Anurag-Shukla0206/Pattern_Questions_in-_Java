import java.util.Scanner;

public class Ques_22 {
     public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            for(int i=1;i<=n;i++){
               
                if(i==1){
                    for(int j=1;j<n*2;j++){
                        System.out.print("* ");
                    }
                }else{

                    for(int j=1;j<=n-i+1;j++){
                        System.out.print("* ");
                    }

                    for(int j=1;j<i*2-2;j++){
                        System.out.print("  ");
                    }

                    for(int j=1;j<=n-i+1;j++){
                        System.out.print("* ");
                    }


                }



                


                System.out.println();

            }



            

            scn.close();
            }
}

















