//import java.util.Scanner;
//import java.util.*;
//public class BinaryPath {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n=sc.nextInt();
//            int[][] mat=new int[2][n];
//            int[][] dp=new int[2][n];
//            StringBuilder res=new StringBuilder();
//            String s1=sc.next();
//            String s2= sc.next();
//            for(int j=0;j<n;j++){
//                mat[0][i]=s1.charAt(i)-'0';
//                mat[1][i]=s2.charAt(i)-'0';
//            }
//            System.out.println(helper(mat,n,1,dp,res));
//        }
//
//    }
//    static StringBuilder helper(int[][] mat,int i,int j,int[][] dp,StringBuilder res) {
//      if(i==0 && j==0) return 1;
//      res.append(mat[i][j]);
//        StringBuilder up =0;
//        if(i>0) up=helper(mat, i - 1, j, dp,res);
//        StringBuilder side = 0;
//        if(j>0) side=helper(mat, i, j - 1, dp,res);
//        return
//    }
//
//}
