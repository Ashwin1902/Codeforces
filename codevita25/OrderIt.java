import java.util.HashMap;
import java.util.Scanner;

public class OrderIt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // HashMap<Integer,String> og=new HashMap<>();
        String[] og=new String[n];
        HashMap<String,Integer> sh=new HashMap<>();
        sc.next();
        for (int i = 0; i < n; i++) {
            sh.put(sc.next(),i);            
        }
        sc.next();
        for (int i = 0; i < n; i++) {
            og[i]=sc.next();
        }
        int res=0;
        for(int i=0;i<n-1;i++){
            String x=og[i];
            String y=og[i+1];
            int sx=sh.get(x);
            int sy=sh.get(y);
            if(sx>sy) res++;
        }
        System.out.println(res);
        sc.close();
    }
}