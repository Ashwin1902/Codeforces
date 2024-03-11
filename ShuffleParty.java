import java.util.Scanner;

public class ShuffleParty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            System.out.println(helper(n));
        }
    }
    static int helper(int n){
        for(int i=0;i<33;i++){
            if(Math.pow(2,i)<=n && Math.pow(2,i+1)>n) return (int)Math.pow(2,i);
        }
        return -1;
    }
}
