package patternPrinting;
import java.util.Scanner;
public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n =sc.nextInt();
        int nsp=n-1,nst=1;
        for(int i =1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
        nsp=1;nst=2*n-3;
        for(int i =1;i<=n;i++){
            for (int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst-=2;
        }


    }
}
