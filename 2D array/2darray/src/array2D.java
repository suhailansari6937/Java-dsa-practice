import java.util.Scanner;

public class array2D {
    // date - 21/1025
    // prefix sum
    static int prefixSumM3(int [][] matrix,int l1,int m1, int l2, int m2){
        findPrefixSumMattrixRow(matrix);
        int sum=0;
        if(l1==0 && m1==0){
            sum =matrix[l2][m2];
        }
        else if(l1==0){
            sum =matrix[l2][m2]-matrix[l2][m1-1];
        } else if (m1==0) {
            sum = matrix[l2][m2] - matrix[l1-1][m2];

        }
        else {
            sum = matrix[l2][m2] - matrix[l1 - 1][m2] - matrix[l2][m1 - 1] + matrix[l1 - 1][m1 - 1];
        }
        return sum;
    }
    static void findPrefixSumMattrixRow(int [][]matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                matrix[i][j]+=matrix[i-1][j];
            }
        }
    }
    static void findPrefixSumMatrixcol(int [][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=1;j<matrix[0].length;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }
    }
    static int prefixSumM2(int [][] matrix,int l1,int m1, int l2, int m2){
        int sum=0;
        findPrefixSumMatrixcol(matrix);
        for(int i=l1;i<=l2;i++){
            if(m1!=0) {
                sum += (matrix[i][m2] - matrix[i][m1 - 1]);
            }
            else sum+=matrix[i][m2];
        }
        return sum;
//        printMatrix(matrix);
    }
    static int prefixSumM1_bruteforce(int [][] matrix, int l1, int m1, int l2, int m2){
        int sum=0;
        for(int i=l1; i<=l2; i++){
            for (int j=m1; j<=m2; j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
    // date - 19/10/25;
    // spiral matrix
    static int [][] spiralMatrix(int n){
        int [][] matrix = new int[n][n];
        int lc =0; int rc = n-1; int tr=0; int br=n-1;
        int totalElement=0;
        int k=1;
        while(totalElement<n*n){

            for(int j=lc;j<=rc && totalElement<n*n;j++){
                matrix [tr][j]=k++;
                totalElement++;
            }
            tr++;
            for (int i=tr;i<=br && totalElement< n*n;i++){
                matrix [i][rc]=k++;
                totalElement++;
            }
            rc--;
            for(int j=rc;j>=lc && totalElement< n*n;j--){
                matrix [br][j]=k++;
                totalElement++;
            }
            br--;
            for(int i=br;i>=tr && totalElement< n*n;i--){
                matrix [i][lc]=k++;
                totalElement++;
            }
            lc++;
        }
        return matrix;
    }
    static int [][] pascalMatrix(int n){
        int [][] matrix = new int[n][];
        for(int i=0;i<n;i++){
            matrix[i]=new int[i+1];
            matrix[i][0]= matrix[i][i]=1;
            for(int j=1;j<i;j++){
                matrix[i][j] = matrix[i-1][j-1]+ matrix[i-1][j];
            }

        }
        return matrix;
    }

    static void reverse(int [] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotateArray(int [][]matrix,int n){
        transposeInplace(matrix,n,n);
        for (int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
    static void transposeInplace(int [][]arr, int r, int c){
        for (int i=0;i<c;i++) {
            for (int j = i+1; j < r; j++) {

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
    }
    static void transposeInplace01(int [][]arr, int r, int c){
        for (int i=0;i<c;i++) {
            for (int j =i+1; j < r; j++) {


                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;

            }
        }
    }
    static void transposeOfMatrix(int [][]arr, int r1,int c1){
        int [][] transpose = new int [c1][r1];
        for (int i=0;i<c1;i++){
            for (int j=0;j<r1;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        printMatrix(transpose);
    }
    static void multiplicationOfMatrix(int [][]arr1,int r1,int c1,int [][]arr2,int r2,int c2){
        if (c1!=r2){
            System.out.println("Multiplication not possible");
            return;
        }
        int mul[][]=new int [r1][c2];
        for (int i=0;i<mul.length;i++){
            for (int j=0;j<mul[0].length;j++){
                for (int k=0;k<c1;k++){
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        printMatrix(mul);
    }
    static void additonOfMatrix(int [][]arr1,int r1,int c1,int [][]arr2,int r2,int c2) {
        if (r1!=r2 || c1!=c2){
            IO.println(String.format("Error: Matrix Dimensions Error"));
            return;
        }
        int [][] add = new int [r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                add[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        printMatrix(add);
    }
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int r1 =  sc.nextInt();
        System.out.println("Enter number of columns : ");
        int c1 = sc.nextInt();
        int [][] matrix1 = new int[r1][c1];
        System.out.println("Enter the elements of the matrix : ");
        for(int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter range : (l1,m1) and (l2, m2) ");
        int l1 = sc.nextInt();
        int m1 = sc.nextInt();
        int l2 = sc.nextInt();
        int m2 = sc.nextInt();
//        System.out.println("Enter number of rows : ");
//        int r2 =  sc.nextInt();
//        System.out.println("Enter number of columns : ");
//        int c2 = sc.nextInt();
//        int [][] matrix2 = new int[r2][c2];
//        System.out.println("Enter the elements of the matrix : ");
//        for(int i = 0; i < matrix2.length; i++) {
//            for(int j = 0; j < matrix2[i].length; j++) {
//                matrix2[i][j] = sc.nextInt();
//            }
//        }
//        printMatrix(matrix);
//        additonOfMatrix(matrix1,r1,c1,matrix2,r2,c2);
//        System.out.println("multiplication of matrix : ");
//        multiplicationOfMatrix(matrix1,r1,c1,matrix2,r2,c2);
//        transposeOfMatrix(matrix1,r1,c1);
//        transposeInplace(matrix1, r1, c1);
//        rotateArray(matrix1,r1);
//        printMatrix(matrix1);
//        printMatrix(spiralMatrix(r1));
//        transposeInplace01(matrix1,r1,c1);
//        printMatrix(pascalMatrix(5));
//       int sum= prefixSumM1_bruteforce(matrix1,l1,m1,l2,m2);
//        System.out.println(sum);
        System.out.println(prefixSumM1_bruteforce(matrix1,l1,m1,l2,m2));
        System.out.println(prefixSumM2(matrix1,l1,m1,l2,m2));
        System.out.println(prefixSumM3(matrix1,l1,m1,l2,m2));

    }
}
