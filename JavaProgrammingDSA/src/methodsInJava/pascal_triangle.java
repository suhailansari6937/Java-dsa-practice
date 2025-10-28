package methodsInJava;
import java.util.Scanner;
public class pascal_triangle {
    public static int factorial(int x){
        int res= 1;
        for (int i =1;i<=x;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n : ");
        int n =sc.nextInt();
        for (int i =0; i<n;i++){
            for (int j =0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            for(int k =0;k<n;k++){
                if(i>=k) {
                    int num = factorial(i) / (factorial(k) * factorial(i - k));
                    System.out.print(num + "  ");
                }
                else ;
            }
            System.out.println();
        }
    }
}
