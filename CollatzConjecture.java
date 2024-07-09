import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int k=sc.nextInt();
            while(k>0){
                if(x==1){
                    int a=y-x;
                    int r=k%a;
                    x=r+1;
                    break;
                }
                if(x==y){
                    x++;
                    k--;
                }
                int a=x%y;
                a=y-a;
                if(k-a>=0) {
                    k -= a;
                    x += a;
                }
                else{
                    x=x+k;
                    break;
                }
                while(x%y==0){
                    x=x/y;
                }
            }
            System.out.println(x);
        }
    }
}
