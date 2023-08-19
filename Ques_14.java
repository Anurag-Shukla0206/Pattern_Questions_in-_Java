import java.util.Scanner;

public class Ques_14 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            for(int i=1;i<n*2;i++){

                if(i<=n){

                    for(int j=n-i;j>=1;j--){
                        System.out.print("\t");
                    }

                    for(int j=1;j<=i;j++){
                        System.out.print("*\t");
                    }
                }
                else{

                    for(int j=i-n;j>=1;j--){
                        System.out.print("\t");
                    }

                    for(int j=2*n-i;j>=1;j--){
                        System.out.print("*\t");
                    }
                }

                System.out.println();
               
            }

            scn.close();
        }
    }
