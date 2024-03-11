import java.util.Scanner;

public class TurtleFingersCounttheValuesofk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i = 0; i < t; i++) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int l=sc.nextInt();
            System.out.println(helper(a,b,l));
        }
    }
    static int helper(int a,int b,int l){
        int k=0;
        int a1=0;
        int b1=0;
        while(true){
            if(l%Math.pow(a,a1)==0){
                a1++;
            }
            else break;
        }
        while(true){
            if(l%Math.pow(b,b1)==0){
                b1++;
            }
            else  break;
        }
        if(a==b) return a1;
        for(int i=2;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0) k++;
        }
        if(a1==1 || b1==1) return a1*b1;
        return (a1*b1)-k;
    }
}
