import java.util.Scanner;

public class Suspension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(Math.min(n,r+(y/2)));
        }
    }
}
