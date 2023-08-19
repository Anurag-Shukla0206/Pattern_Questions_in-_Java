import java.util.Scanner;

public class Ques_31 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();            
        

            for(int i=1;i<=n;i++){

                for(int j=n;j>=1;j--){
                    if(j==i){
                        System.out.print("*   ");
                    }
                    else{
                    System.out.print(j+"   ");
                    }
                }
               

                System.out.println();


            }

            scn.close();
}
}
