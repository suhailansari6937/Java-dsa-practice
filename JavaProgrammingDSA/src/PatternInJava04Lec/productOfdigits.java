package PatternInJava04Lec;
import java.util.Scanner;
public class productOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int pro = 1;
        while(n!=0){
            int ld = n%10;
            pro*=ld;
            n/=10;
        }
        System.out.println(pro);
    }
}
