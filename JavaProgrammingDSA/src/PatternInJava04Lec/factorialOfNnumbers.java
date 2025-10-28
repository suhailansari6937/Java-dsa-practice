package PatternInJava04Lec;
import java.util.Scanner;
public class factorialOfNnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int fac= 1;
        while(n!=0){
            for(int i=n;i>=1;i--){
                fac*=i;

            }
            System.out.println(fac);
            fac = fac/fac;
            n--;
        }
    }
}
