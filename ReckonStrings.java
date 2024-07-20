import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ReckonStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            List<HashSet<Character>> arr=new ArrayList<>();
            for (int j = 0; j < m; j++) {
                char x=sc.next().charAt(0);
                char y=sc.next().charAt(0);
                boolean flag=false;
                for(HashSet<Character> h:arr){
                    if(h.contains(x) || h.contains(y)){
                        h.add(x);
                        h.add(y);
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    HashSet<Character> h1=new HashSet<>();
                    h1.add(x);
                    h1.add(y);
                    arr.add(h1);
                }
            }
          //  System.out.println(arr);
            int res=0;
            for(HashSet<Character> h:arr){
                int s=h.size();
                res=(res+((int)Math.pow(s,n)-(int)Math.pow(n,n)))%1000000007;
            }
          //  System.out.println(res);
           System.out.println(((int)Math.pow(26,n)-res)%1000000007);
            }
        }
    }

