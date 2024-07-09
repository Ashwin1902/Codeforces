import java.util.Scanner;

public class StairPeakorNeither {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(b>a && b>c) System.out.println("PEAK");
            else if(b>a && c>b) System.out.println("STAIR");
            else System.out.println("NONE");
        }
    }
}
