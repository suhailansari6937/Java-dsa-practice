package PatternInJava04Lec;
import java.util.Scanner;
public class reverseOfAdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int num = n;
        int r=0;
        while(n!=0){
            int ld=n%10;
            r=r*10+ld;
//            System.out.print(ld);
            n/=10;
        }
        System.out.println(r +num);
    }
}
