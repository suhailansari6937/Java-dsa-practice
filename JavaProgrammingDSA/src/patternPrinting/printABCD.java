package patternPrinting;

import java.util.Scanner;

public class printABCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : :");
        int n = sc.nextInt();
//        System.out.println("Enter number of columns : ");
//        int n = sc.nextInt();
        for(int i =1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(i+64) +" ");
            }
            System.out.println();
        }
    }
}

