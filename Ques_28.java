import java.util.Scanner;

public class Ques_28 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();

            int str =1;
            
            

            for(int i=1;i<=n;i++){

                int num = i;
                
                for(int j=n-i;j>=1;j--){
                    System.out.print("  ");
                }
              
                for(int j=1;j<=str;j++){
                    System.out.print(num+" ");
                    if(j<=str/2){
                        num++;
                    }
                    else{
                        num--;
                    }
                }


                str+=2;

                System.out.println();


            }

            scn.close();
}
}
