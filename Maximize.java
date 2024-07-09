import java.util.Scanner;

public class Maximize {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x=sc.nextInt();
            int res=0;
            int ans=0;
            for (int j = 1; j < x; j++) {
                for(int k=1;k<=j;k++){
                    if(j%k==0 && x%k==0){
                        if(k+j>res){
                            res=k+j;
                            ans=j;
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
