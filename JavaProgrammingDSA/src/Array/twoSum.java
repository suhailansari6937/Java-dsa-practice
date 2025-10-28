package Array;

public class twoSum {
    public static void main(String[] args) {
        int [] arr = {12,21,38,69,74,83};
        int x = 81;
        int [] ans = new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if (arr[i]+arr[j] == x){
                   ans[0]=i; ans [1]=j;
                }
            }
        }
        System.out.println(ans[0] +" "+ans[1]);
    }
}
