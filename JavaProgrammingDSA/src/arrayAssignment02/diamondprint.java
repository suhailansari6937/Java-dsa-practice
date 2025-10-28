package arrayAssignment02;

public class diamondprint {
    public static void main(String[] args) {

        int n = 5;
        for (int i =0; i<n;i++){
            for (int j =0; j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int j =0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int nst = 2*n-3;
        for (int i =0;i<n-1;i++){
            for (int j =0;j<i+1;j++){
                System.out.print(" ");
            }
            for (int j =0; j<nst;j++){
                System.out.print("*");
            }
            System.out.println();
            nst-=2;
        }
    }
}
