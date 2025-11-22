import java.util.Arrays;
import java.util.Scanner;

public class YuuKoitoandMinimumAbsoluteSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
//            int res=0;
            int f=sc.nextInt();
            for (int j = 1; j < n-1; j++) {
                int c=sc.nextInt();
                if(c==-1) c=0;
                arr[j]=c;
            }
            int l=sc.nextInt();
            if(l==-1 && f==-1){
                l=0;
                f=0;
            }
            else if(l==-1){
                l=f;
            }
            else if(f==-1){
                f=l;
            }
            arr[0]=f;
            arr[n-1]=l;
            System.out.println(Math.abs(l-f));

            for (int j = 0; j < n; j++) {
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }
    }
}
