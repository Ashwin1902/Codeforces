import java.util.*;
import java.util.Scanner;

public class ChooseTheDifferentOnes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n,m,k;
            n=sc.nextInt();
            m=sc.nextInt();
            k=sc.nextInt();
            int[] arr=new int[n];
            int[] brr=new int[m];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            for(int p=0;p<m;p++){
                brr[p]=sc.nextInt();
            }
            System.out.println(helper(arr,brr,k));

        }
        sc.close();
    }
    static String helper(int[] arr,int[] brr,int k){
        HashSet<Integer> ha=new HashSet<>();
        HashSet<Integer> hb=new HashSet<>();
        for(int x:arr){
            ha.add(x);
        }
        for(int x:brr){
            hb.add(x);
        }
        int a=0;
        int b=0;
        int c=0;
        for(int i=1;i<=k;i++){
            if(!(ha.contains(i)||hb.contains(i))) return "NO";
            if(ha.contains(i)&&hb.contains(i)){
                c++;
            }
            else if(ha.contains(i)){
                a++;
            }
            else if(hb.contains(i)){
                b++;
            }
        }
        if(a==b) return "YES";
        else{
            int big,small;
            if(a>b){
                if(b+c>=a) return "YES";
                else return "NO";
            }
            else {
                if(a+c>=b) return "YES";
                else return "NO";
            }
        }
    }
}
