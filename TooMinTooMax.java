import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
public class TooMinTooMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            System.out.println(helper(arr,n));
        }
    }
    static int helper(int[] arr, int n){
        int i=0;
        int k=1;
        int l=n-1;
        int j=n-2;
        Arrays.sort(arr);
        return Math.abs(arr[i]-arr[j])+Math.abs(arr[k]-arr[j])+Math.abs(arr[l]-arr[k])+Math.abs(arr[i]-arr[l]);
    }
}
