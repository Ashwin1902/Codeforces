import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class CoinGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            System.out.println(helper(n, s));
        }
    }

    static String helper(int n, String s) {
        Deque<Character> d = new ArrayDeque<Character>();
        for (int i = 0; i < n; i++) {
            d.add(s.charAt(i));
        }
        int i=0;
        while(!d.isEmpty()) {
            int c=0;
            while (d.peek() != 'U') {
                d.addLast(d.pollFirst());
                c++;
                if(c==d.size()) break;
            }
            if(c==d.size()) break;
            d.pollFirst();
            if(!d.isEmpty()){
                char x=d.pollFirst();
                if(x=='U') x='D';
                else x='U';
                d.addFirst(x);
                char y=d.pollLast();
                if(y=='U') y='D';
                else y='U';
                d.addLast(y);
            }
            i++;
        }
        if(i%2==0) return "NO";
        else return "YES";
    }
}
