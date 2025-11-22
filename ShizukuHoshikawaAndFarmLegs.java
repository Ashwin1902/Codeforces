import java.util.Scanner;

public class ShizukuHoshikawaAndFarmLegs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int res=0;
            while(n>=0){
                if(n%4==0) res++;
                n-=2;
            }
            System.out.println(res);
        }
    }
}
