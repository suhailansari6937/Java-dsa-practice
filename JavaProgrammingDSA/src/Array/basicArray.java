package Array;
class Array{
    void searching(int k){
        // k is the searching element
        int [] arr = {12,5,4,7,4,8};
        int ans =-1;
        for(int i =0; i<arr.length; i++) {
            if (arr[i] == k) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {

            System.out.println("Not found");
        }
        else {
            System.out.println("Found "+k+ " at index "+ans);
        }

    }
    void maxOfArray(){
        int [] arr = {1,5,3,12,15,45,-80};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max) max =arr[i];
        }
        System.out.println(max);
    }
    int arraySum(int [] arr){
        int sum  = 0;
        for(int i =0; i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;

    }
    void demoArray(){
        int [] arr = {10,20,50};
        System.out.println(arr[0]);
        System.out.println(arr[2]);
    }
}
public class basicArray {
    public static void main(String[] args) {
        int [] arr ={10,20,03};
        Array obj= new Array();
//        int i =obj.arraySum(arr);
//        System.out.println(i);
//        obj.maxOfArray();
    obj.searching(4);
    }
}
