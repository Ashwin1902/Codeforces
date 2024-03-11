import java.util.Scanner;

public class YetAnotherCoinProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            Integer[] dp=new Integer[n+1];
            System.out.println(helper(n,dp));
        }
    }
    static int helper(int n,Integer[] dp){
        dp[0]=0;
        int x1=Integer.MAX_VALUE;
        int x3=Integer.MAX_VALUE;
        int x6=Integer.MAX_VALUE;
        int x10=Integer.MAX_VALUE;
        int x15=Integer.MAX_VALUE;
        x1=1;
        x3=1;
       x6=1;
       x10=1;
       x15=1;
      int res=Integer.MAX_VALUE;
      for(int i=2;i<=n;i++){
            int ek=Integer.MAX_VALUE;
            int teen =Integer.MAX_VALUE;
            int ch =Integer.MAX_VALUE;
            int das = Integer.MAX_VALUE;
            int pan = Integer.MAX_VALUE;
            if(i-1>0) {
                ek=x1;
                x1++;
            }
            if(i-3>0) {
                teen = x3;
                x3++;
            }
            if(i-6>0) {
                ch=x6;
                x6++;
            }
            if(i-10>0) {
                das = x10;
                x10++;
            }
            if(i-15>0){
                pan=x15;
                x15++;
            }
            res=Math.min(Math.min(pan,Math.min(das,Math.min(ch,teen))),ek)+1;
        }
        return res;
        }
    }

