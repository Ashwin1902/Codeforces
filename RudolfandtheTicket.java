import java.util.Scanner;

public class RudolfandtheTicket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m= sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            int[] brr=new int[m];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                brr[j]=sc.nextInt();
            }
            System.out.println(helper(arr,brr,k));
        }
    }
    static int helper(int[] arr,int[] brr, int k){
        int res=0;
        for(int x:arr){
            if(x<k){
                for(int y:brr){
                    if(x+y<=k) res++;
                }
            }
        }
        return res;
    }
}
