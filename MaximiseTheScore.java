import java.util.Arrays;
import java.util.Scanner;

public class MaximiseTheScore {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr=new int[2*n];
            for(int j=0;j<2*n;j++){
                arr[j]=sc.nextInt();
            }
            System.out.println(helper(arr,n));
        }
    }
    static int helper(int[] arr,int n){
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i<2*n;i+=2){
            res+=Math.min(arr[i],arr[i+1]);
        }
        return res;
    }
}
