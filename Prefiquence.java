import java.util.Scanner;

public class Prefiquence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            String a=sc.next();
            String b=sc.next();
            int ans=0;
            int j=0;
            for(int p=0;p<n && p<m;p++){
                char x=a.charAt(p);
                while(j<m){
                    if(x==b.charAt(j)){
                        ans++;
                        j++;
                        break;
                    }
                    j++;
                }
                if(j==m) break;
            }
            System.out.println(ans);
        }
    }
}
