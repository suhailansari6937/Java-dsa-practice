package PatternInJava04Lec;
import java.util.Scanner;
public class sumOfDigit_ofGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num : ");
        int n = sc.nextInt();
        int sum = 0;
        for(;n!=0;){
            int a = n%10;
            sum+=a;
            n/=10;
        }
        System.out.println(sum);
    }
}
