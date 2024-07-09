import java.util.Scanner;

public class AssemblyviaRemainders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] a=new int[n-1];
            for (int j = 0; j < n-1; j++) {
                a[j]=sc.nextInt();
            }
            int[] res=new int[n];
            res[0]=a[0]+1;
            System.out.print(res[0]+" ");
            for (int j = 1; j < n; j++) {
                int f=(res[j-1]*2)+a[j-1];
                int s=0;
                if(f%res[j-1]!=a[j-1]) s=3;
                while(f%res[j-1]!=a[j-1]){
                    f=(res[j-1]*s)+a[j-1];
                    s++;
                }
                res[j]=f;
                System.out.print(res[j]+" ");
            }
            System.out.println();
        }
    }
}
