package PatternInJava04Lec;
import java.util.Scanner;
public class productOfNon0Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int pro =1;
        while(n!=0){
            int ld =n%10;
            if(ld==0){
                pro*=1;
            }
            else {
                pro*=ld;
            }
            n/=10;
        }
        System.out.println(pro);
    }
}
