package Array_problem01_2D;

import java.util.Scanner;

public class assignment {
    static boolean q3ToeplitzMatrix(int [][] matrix, int r, int c){
        int tr =0; int br = r-1; int lc =0; int rc = c-1;
        for(int i =lc; i<=rc; i++){
            int j = tr;
            int k =i;
            while(j<=br && k<=rc){
                if(matrix[j][k]!=matrix[tr][i]) return false;
                j++;
                k++;
            }
        }
//        tr++;
        for(int i =tr; i<=br; i++){
            int j =lc;
            int k =i;
            while(j<=rc && k<=br){
                if(matrix[k][j]!=matrix[i][lc]) return false;
                j++;
                k++;
            }
        }

        return true;
    }
    static void TransposeInPlace(int [][]arr, int r1, int c1){
        for(int i=0;i<r1;i++){
            for (int j=i+1;j<c1;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverserows(int [] arr){
        int i=0;
        int j =arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    static void reversecolumn(int [][] arr){
        int top=0;
        int bottom=arr.length-1;
        while(top<bottom){
            for(int j =top;j<bottom;j++){
                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;
            }
            top++;
            bottom--;
        }
    }
    static int[][] q1multiplicationMatrix(int [][] arr1, int r1, int c1, int [][] arr2, int r2, int c2) {
        int [] [] result= new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r2;k++){
                    result[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return result;
    }
    static void anticlockRotation(int [][] arr, int r1, int c1){
        TransposeInPlace(arr, r1, c1);
        for(int i=0;i<c1;i++) {
            reversecolumn(arr);
        }
        printMatrix(arr);
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
//        printMatrix(multiplicationMatrix(matrix1, r1, c1, matrix2, r2, c2));
//       anticlockRotation(matrix1, r1, c1);
//        anticlockRotation(matrix1, r1, c1);
//        anticlockRotation(matrix1, r1, c1);
        System.out.println(q3ToeplitzMatrix(matrix1, r1, c1));
    }
}
