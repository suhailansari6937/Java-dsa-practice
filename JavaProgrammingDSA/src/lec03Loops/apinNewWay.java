package lec03Loops;
import java.util.Scanner;
public class apinNewWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int a =3; int d =4;
        for(int i =1;i<=n;i++){
            System.out.println(a);
            a+=d;

        }
    }
}
