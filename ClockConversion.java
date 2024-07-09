import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s=sc.next();
            StringBuilder res=new StringBuilder(s);
            StringBuilder res2=new StringBuilder();
            res2.append(s.charAt(0));
            res2.append(s.charAt(1));
            int a=Integer.parseInt(res2.toString());
            if(a>=12) {
                res.append(" PM");
                if(a==12) System.out.println(res);
                else {
                    a -= 12;
                    String x=String.valueOf(a);
                    if(a>9) {
                        res.setCharAt(0, x.charAt(0));
                        res.setCharAt(1, x.charAt(1));
                    }
                    else {
                        res.setCharAt(0,'0');
                        res.setCharAt(1, x.charAt(0));
                    }
                    System.out.println(res);
                }
            }
            else{
                if(a==0){
                    res.setCharAt(0, '1');
                    res.setCharAt(1, '2');
                }
                res.append(" AM");
                System.out.println(res);
            }

        }
    }
}
