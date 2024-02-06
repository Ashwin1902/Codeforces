import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+1;
        while(true){
            if(isPrime(c)){
                break;
            }
            c++;
        }
        if(c==b) System.out.println("YES");
        else System.out.println("NO");

    }
    static boolean isPrime(int a){
        for(int i=2;i<=a/2;i++){
            if(a%i==0) return false;
        }
        return true;
    }
}
