import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            int max=-1;
            int x=0;
            for (int l = 0; l < n; l++) {
               int y=sc.nextInt();
                if(l==j-1) x=y;
                max=Math.max(max, y); 
            }
            if(k==1 && x!=max) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}
