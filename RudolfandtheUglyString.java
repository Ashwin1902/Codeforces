import java.util.Scanner;

public class RudolfandtheUglyString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(helper(s,n));
        }
    }
    static int helper(String s, int n){
        int res=0;
        if(n<3) return 0;

        String pi="pie";
        String m="map";
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<3;i++){
            s2.append(s.charAt(i));
        }
        if(s2.toString().equals(pi)){
            res++;
            s2.setCharAt(0,'/');
        }

            if(s2.toString().equals(m)) {
                res++;
                s2.setCharAt(2,'/');
            }
        for(int i=3;i<n;i++){
             s2.deleteCharAt(0);
             s2.append(s.charAt(i));
            if(s2.toString().equals(pi)){
                res++;
                s2.setCharAt(0,'/');
            }

            if(s2.toString().equals(m)) {
                res++;
                s2.setCharAt(2,'/');
            }
        }
        return res;
    }
}
