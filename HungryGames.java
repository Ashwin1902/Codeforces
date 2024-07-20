import java.util.Scanner;

public class HungryGames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            int res=0;
            int l=0;
            int r=0;
            int s=0;
            while(r<n){
                    s+=arr[r];
                    while (s > x && l <= r) {
                        s -= arr[l];
                        l++;
                        res++;
                    }
                    r++;
            }
//            r=0;
//            while(r<n){
//                if(arr[r]>x){
//                    res++;
//                }
//                r++;
//            }
            int m=(n*(n+1))/2;
            System.out.println(m-res);
        }
    }
}
