import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Handler;

public class FreeCash {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]= sc.nextInt();
        }
       // if(n==1) System.out.println("1");
        System.out.println(helper(n,arr));
    }
    static int helper(int n,int[][] arr){
        int res=Integer.MIN_VALUE;
        HashMap<String,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            StringBuilder s=new StringBuilder();
            s.append(arr[i][0]);
            s.append(':');
            s.append(arr[i][1]);
            h.put(s.toString(),h.getOrDefault(s.toString(),0)+1);
        }
        for(String x:h.keySet()){
            res=Math.max(res,h.get(x));
        }
        return res;
    }
}
