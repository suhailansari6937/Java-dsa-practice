import java.util.Scanner;

public class pascal {
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] pasacalTrianngleDefault(int n){
        int [][]ans = new int [n][];
        for (int i = 0; i < n; i++) {
            ans[i]=new int [i+1];
            ans[i][0]=ans[i][i]=1;
            for (int j = 1; j < i; j++) {
               ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
            }

            }
        return ans;
    }
    static int factorial(int n){
        int sum=1;
        for(int i=1;i<=n;i++)
            sum=sum*i;
        return sum;
    }
    static int NcR(int n, int r){
        int ncr= factorial(n)/(factorial(r)*factorial(n-r));
        return ncr;
    }
    static void pascalTriangle(int n){
        for (int i=0; i<n; i++ ) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(NcR(i, j) + " ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();
//        pascalTriangle(n);
        printMatrix(pasacalTrianngleDefault(n));
    }
}
