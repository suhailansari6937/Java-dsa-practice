package IfElse_Revision02.HW;
import java.util.Scanner;

public class buySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price of item : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price of item :");
        int sp = sc.nextInt();
        if(sp>cp){
            int profit = sp-cp;
            System.out.println("yupp its a profit of "+profit);
        }
        else if(sp==cp) {
            System.out.println("NO profir Nor loss");
        }
        else{
            int loss = cp-sp;
            System.out.println("Loss of "+loss);
        }
    }
}
