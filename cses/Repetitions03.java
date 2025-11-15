package cses;

import java.util.Scanner;

public class Repetitions03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int res=1;
        int res2=1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(i-1)) res2++;
            else{
                res=Math.max(res,res2);
                res2=1;
            }
        }
        res=Math.max(res,res2);
        System.out.println(res);
        sc.close();
    }
}
