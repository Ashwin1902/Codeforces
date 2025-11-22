import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();

        int td=k*l;
        int res=Math.min(td/(nl*n),Math.min((c*d)/n,p/(np*n)));
        System.out.println(res);
    }
}
