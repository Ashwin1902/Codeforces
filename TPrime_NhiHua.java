import java.util.Scanner;

public class TPrime_NhiHua {
    public static void main(String[] args) {
        long n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(long i=0;i<n;i++){
            long a=sc.nextLong();
            System.out.println(helper(a));
        }
    }
    static String helper(long a){
long res=2;
        long squareRoot = (long) Math.sqrt(a);
        if(squareRoot * squareRoot != a) return "NO";
        for(long i=2;i*i<=a;i++){
            if(a%i==0){
                if(a/i!=i) return "NO";
                else res++;
            }
        }
        if(res==3) return "YES";
        else return "NO";
    }
}
