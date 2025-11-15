package cses;

import java.util.Scanner;

public class MissingNumber02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int rsum=0;
        for (int i = 1; i <=n; i++) {
            if(i<n) sum+=sc.nextInt();
            rsum+=i;
        }
        System.out.println(rsum-sum);
        sc.close();
    }
    
}
