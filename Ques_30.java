import java.util.Scanner;

public class Ques_30 {
    public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();            
        

            for(int i=n;i>=1;i--){

                for(int j=n;j>=1;j--){
                    System.out.print(j+"\t");
                }
               

                System.out.println();


            }

            scn.close();
}
}
