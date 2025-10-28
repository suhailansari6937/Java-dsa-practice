import java.util.Scanner;
public class ques02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of arrays: ");
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i =0; i<n;i++){
            a[i] = scn.nextInt();
        }
        for (int i =0; i<m;i++){
            b[i] = scn.nextInt();
        }
        int count =0;
        for (int i =0; i<n;i++){
            boolean found = false;
            for (int j =i+1;j<n;j++){
                if (a[i]==a[j]){
                    found = true;
                    break;
                }
            }
            if (!found) count++;
        }
        for (int i =0;i<m;i++){
            boolean check =false;
            for (int j =0;j<n;j++){
                if (b[i]==a[j]){
                    check = true;
                    break;
                }
            }
            for (int j =i+1;j<m;j++){
                if (b[i]==b[j]){
                    check = true;
                    break;
                }
            }
            if (!check) count++;
            }
        System.out.println(count);
    }

    }
