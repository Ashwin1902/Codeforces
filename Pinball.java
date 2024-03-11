//import java.util.Scanner;
//
//public class Pinball {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n=sc.nextInt();
//            String s=sc.next();
//
//            for (int j = 0; j < n; j++) {
//                StringBuilder s1=new StringBuilder(s);
//                System.out.print(helper(j,s1)+" ");
//            }
//            System.out.println();
//        }
//    }
//    static int helper(int j,StringBuilder s1){
//        int res=0;
//        while(true){
//            if(j<0 || j>=s1.length()) break;
//            if(s1.charAt(j)=='>'){
//                j++;
//                res++;
//                s1.setCharAt(j-1,'<');
//            }
//            else if(s1.charAt(j)=='<'){
//                j--;
//                res++;
//                s1.setCharAt(j+1,'>');
//            }
//
//
//        }
//        return res;
//    }
//}
