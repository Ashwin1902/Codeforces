import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ApplemanAndCardGame {
    public static void main(String[] args) {
        long n,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        String s=sc.next();
        System.out.println(helper(n,k,s));
    }
    static long helper(long n,long k,String s){
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<n;i++){
            char x=s.charAt(i);
            h.put(x,h.getOrDefault(x,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        pq.addAll(h.values());
        long res=0;
        while(k>=0 && !pq.isEmpty()){
            if(pq.peek()<=k){
                long a=pq.poll();
                res+=(a*a);
                k-=a;
            }
            else {
                long a=pq.poll();
                res+=(k*k);
                k-=a;

            }
        }
        return res;
    }
}
