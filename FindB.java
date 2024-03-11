import java.util.HashMap;
import java.util.Scanner;

public class FindB {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int n=s.nextInt();
            int q=s.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=s.nextInt();
            }
            for(int x=0;x<q;x++){
                int a=s.nextInt();
                int b=s.nextInt();
                System.out.println(helper(arr,a-1,b-1));
            }
        }
    }
    static String helper(int[] arr,int st,int en){
        HashMap<Integer,Integer> h=new HashMap<>();
        int n=(en-st+1)/2;
        if(en-st+1==1) return "NO";
        for(int i=st;i<=en;i++){
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
            if(h.get(arr[i])>n) return "NO";
        }
        return "YES";
    }
}
