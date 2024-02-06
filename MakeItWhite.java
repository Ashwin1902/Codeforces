import java.util.Scanner;
import java.util.*;
public class MakeItWhite {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++){
            int s=sc.nextInt();
            String str=sc.next();
            System.out.println(helper(s,str));
        }
    }
    static int helper(int s,String str){
        int i=0;
        int j=0;
        for(j=0;j<s;j++){
            if(str.charAt(j)=='B'){
                break;
            }
        }
        for(i=s-1;i>=0;i--){
            if(str.charAt(i)=='B'){
                break;
            }
        }
        int x=Math.abs(i-j);
        if(x>=s) return 0;
        return x+1;
    }
}
