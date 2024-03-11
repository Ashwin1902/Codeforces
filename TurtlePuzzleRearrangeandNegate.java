import java.util.Scanner;

public class TurtlePuzzleRearrangeandNegate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int res=0;
            for(int j=0;j<n;j++){
                int x=sc.nextInt();
                res+=Math.abs(x);
            }
            System.out.println(res);
        }
    }
}
