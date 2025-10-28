package Array;
import java.util.Scanner;
class Operations{
    int [] smallestAndLargest(int [] arr){
//        int [] ans = new int [2];
        int min = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if (min > arr[i]) min = arr[i];
                if (max < arr[i]) max = arr[i];
            }
            return new int []{min,max};
        }





    int lastOccurence(int [] arr, int x){
        int LastOccur = -1;
        for (int i =0; i<arr.length;i++){
            if (arr[i] == x){
                LastOccur= i;
            }
        }
        return LastOccur;
    }
    public int CountOccurence(int [] arr, int x){
        int count = 0;
        for (int i =0; i<arr.length;i++){
            if (arr[i]==x) count++;
        }
        return count;

    }
}

public class ArraysPw {
    public static void main(String[] args) {
        Operations obj = new Operations();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter values : ");
        for (int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("Enter searching element");
//        int x = sc.nextInt();
//        System.out.println ("count of "+x +"is " +obj.CountOccurence(arr,x));
//        System.out.println("Last Occurence of "+x + " is "+ obj.lastOccurence(arr,x));
        int [] ans  =obj.smallestAndLargest(arr);
        System.out.println("Smallest : "+ans[0]+ "And Largest : "+ans[1] );


    }
}
