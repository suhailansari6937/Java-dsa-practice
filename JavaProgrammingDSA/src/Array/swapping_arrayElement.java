package Array;

public class swapping_arrayElement {
    public static void change(int []c){
        int temp = c[0];
        c[0] = c[1];
        c[1]=temp;

    }
    public static void main(String[] args) {
        int [] a ={10,20};
        System.out.println(a[0]+  " "+a[1]);
        change(a);
        System.out.println(a[0]+  " "+a[1]);


    }
}
