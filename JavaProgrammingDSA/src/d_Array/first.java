package d_Array;

import java.util.Scanner;

public class first {
    static void transposeOfMatrix(int [][] arr, int r1,int c1){
        int [][] trans  = new int [c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                trans[i][j]=arr[j][i];
            }
        }
        print2dArray(trans);

    }
    static void multiplicationOfArray(int [][]arr1,int r1,int c1, int[][]arr2,int r2,int c2){
        if(r2!=c1) {
            System.out.println("Multiplication not possible!!");
            return;
        }
        int [][] mul = new int [r1][c2];
        for(int i=0;i<r1;i++) {
            for(int j=0;j<c2;j++) {
                for(int k=0;k<r2;k++) {
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }

            }
        }
        print2dArray(mul);

    }
    static int [][] additionOfArray(int[][]arr1,int r1,int c1,int[][]arr2, int r2, int c2){
       if((r1!=r2) || (c1!=c2)){
           System.out.println("Invalid Input");
            return null;
       }
       int [][] result = new int [r1][c1];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return result;
    }
    static void print2dArray(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and col of first array: ");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int [][] arr1 = new int [row1][col1];
        System.out.println("Enter elements of first array: ");
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
//        System.out.println("Enter row and col of second array: ");
//        int row2 = sc.nextInt();
//        int col2 = sc.nextInt();
//        int [][] arr2 = new int [row2][col2];
//        System.out.println("Enter elements of second array: ");
//        for(int i=0;i<row2;i++){
//            for(int j=0;j<col2;j++){
//                arr2[i][j] = sc.nextInt();
//            }
//        }
        System.out.println("First array : ");
        print2dArray(arr1);
//        System.out.println("Second array : ");
//        print2dArray(arr2);
        System.out.println("Addition is : ");
//        int [][] result =additionOfArray(arr1,row1,col1,arr2,row2,col2);
//        if (result!=null){
//            print2dArray(result);

//        }
//        multiplicationOfArray(arr1,row1,col1,arr2,row2,col2);
        transposeOfMatrix(arr1,row1,col1);
    }
}
