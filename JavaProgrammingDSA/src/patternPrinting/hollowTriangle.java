package patternPrinting;
import java.util.Scanner;
public class hollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter row and column : ");
        int m =sc.nextInt();
        int n = sc.nextInt();
        for(int i =1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || j==1 || i==m || j==n){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
