package Assignment02;
class Assignment{
    void printArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    int [] que1(int [] arr){
        int n = arr.length;
        int[] ans = new int [n];
        int ind=0;
        for (int i=0;i<n;i++){
            if(arr[i]>0) {
                ans[ind] = arr[i];
                ind++;
            }
        }
        for (int j =0;j<n;j++){
            if (arr[j]<0){
                ans[ind]=arr[j];
                ind++;
            }
        }
        return ans;


    }
}

public class peak {
    public static void main(String[] args) {
       int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
       Assignment obj = new Assignment();
       int [] ans = obj.que1(arr);
       obj.printArray(ans);
    }
}
