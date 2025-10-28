package Assignment02;

public class questions {
    public static int firstREpeating(int [] arr){
        int ans =-1;
        for(int i =0; i<arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    ans = i+1;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,5,3,4,3,5,6};
        int ans = firstREpeating(arr);
        System.out.println(ans);
    }
}
