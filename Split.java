import java.util.HashMap;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            HashMap<Integer,Integer> h=new HashMap<>();
            int nn=2*n;
            for (int j = 0; j < nn; j++) {
                int x=sc.nextInt();
                h.put(x,h.getOrDefault(x,0)+1);
            }
            int res=0;
            int y=0;
            int y4=0;
            for(int x:h.keySet()) {
                int s=h.get(x);
                if (s%2 != 0) {
                    res += 1;
                    y += h.get(x);
                }
                else if (s % 4 == 0) {
                    y4++;
                }
                else{
                    res+=2;
                }
            }
            if(y4%2==0) res+=(y4*2);
            else{
                res+=((y4-1)*2);
                if(y>=2) res+=2;
            }
            System.out.println(res);
        }
    }

}
