import java.math.BigInteger;
import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n= sc.nextLong();
        if(n==1000000000000000000L) {
            System.out.println(1000000000000000000L);
            return;
        }
        long res=0;
        long c=10;
        long c2=1;
        while(n>0){
            long x=n%10;
            n/=10;
            if(x>=5 && !(n==0 && x==9)) x=9-x;
            res+=c;
            res+=(c2*x);
            res=res%c;
            c*=10;
            c2*=10;
        }
        System.out.println(res);
//        System.out.println(res%c);

    }
}
