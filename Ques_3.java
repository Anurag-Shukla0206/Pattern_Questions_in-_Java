import java.util.Scanner;

public class Ques_3 {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
    
            int n = scn.nextInt();
    
            for(int i=n;i>=1;i--){
                for(int j=i;j>=1;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }
    
            scn.close();
        }
    }

