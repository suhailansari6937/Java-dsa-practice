package methodsInJava;
import java.util.Scanner;
public class PandC01 {
    public static int factorial(int x){
        int res = 1;
        for(int i=1;i<=x;i++ ){
            res*=i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = factorial(n);
        int rfact = factorial(r);
        int n_rfact = factorial(n-r);
        int ncr = nfact/(rfact*n_rfact);
        int npr = nfact/n_rfact;
        if(n>=r) {
            System.out.println("nCr == " + ncr);
            System.out.println("nPr == " + npr);
        }
        else System.out.println("Invalid input");

    }
}
