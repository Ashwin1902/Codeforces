import java.util.Scanner;

public class MovingChips {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int j=0;j<t;j++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(helper(arr, n));
        }
    }
    static int helper(int[] arr,int n){
        int i,j;
        for(i=0;i<n;i++){
           if(arr[i]==1) break;
        }
        for(j=n-1;j>=0;j--){
            if(arr[j]==1) break;
        }
        int c=0;
        for(int x=i;x<=j;x++){
            if(arr[x]==0) c++;
        }
        return c;
    }
}
