import java.util.Scanner;

public class EntertainmentinMAC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(helper(s,n));
        }
    }
    static String helper(String s,int n){
        StringBuilder res=new StringBuilder(s);
      StringBuilder res2=new StringBuilder(s);
       res2.reverse();
        if(res.compareTo(res2)>0){
            res.reverse();
            n--;
        }
        if(n%2==0){
            return res.toString();
        }
        else{
            StringBuilder res3=new StringBuilder(res);
            res3.reverse();
            res.append(res3);
            return res.toString();
        }
    }
}
