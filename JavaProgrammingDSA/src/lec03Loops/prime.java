package lec03Loops;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag = true;
                break;
            }
        }
        if(n==1){
            System.out.println("Neither prime nor composite");
        }
       else if(flag==false){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Composite Number");
        }
    }
}
