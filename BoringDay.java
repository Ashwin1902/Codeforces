import java.util.Scanner;

public class BoringDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int[] cards=new int[n];
            int res=0;
            for (int j = 0; j < n; j++) {
                cards[j]=sc.nextInt();
            }
            int sum=0;
            int x=0;
            while(x<n){
                if(cards[x]>=l && cards[x]<=r){
                    res++;
                    sum=0;
                }
                else {
                    sum += cards[x];
                    if (sum >= l && sum <= r) {
                        res++;
                        sum = 0;
                    } else if (sum > r) {
                        sum = 0;
                    }
                }
                x++;
            }
            System.out.println(res);
        }
    }
}
