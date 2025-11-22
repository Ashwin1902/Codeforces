import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        for (int i = 0; i < n; i++) {
            String x=sc.next();
            if(x.charAt(0)=='-' || x.charAt(2)=='-') res--;
            else res++;
        }
        System.out.println(res);
    }
}
