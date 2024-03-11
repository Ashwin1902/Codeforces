import java.util.Scanner;

public class TurtleMathFastThreeTask {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i = 0; i < t; i++) {
           int n=sc.nextInt();
           int[] arr=new int[n];
           int sum=0;
            for(int j = 0; j < n; j++) {
               arr[j]=sc.nextInt();
               sum+=arr[j];
            }
            System.out.println(helper(arr,n,sum));
        }
    }
    static int helper(int[] arr,int n,int sum){
        if(sum%3==0) return 0;
        if(sum%3==2) return 1;
        int res=0;
        for(int x:arr){
            if((sum-x)%3==0) return 1;
        }
        return 2;
    }
}
