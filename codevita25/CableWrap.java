package codevita25;

import java.util.Scanner;

public class CableWrap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] mat=new char[n][m];
        int ri=0;
        int rj=0;
        int dir=-1;
        boolean flag=false;
        // false hori
        // true ver
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j]=sc.next().charAt(0);
                if(mat[i][j]=='R' && dir==-1){
                    dir=0;
                    ri=i;
                    rj=j;
                }
                else if(dir==0){
                    if(j>0 && mat[i][j-1]=='R') flag=false;
                    else if(i>0 && mat[i-1][j]=='R') flag=true;
                    dir=2;
                }
            }
        }
        int res=0;
        StringBuilder rr=new StringBuilder();
        // h rod
        if(!flag){
            for(int i=0;i<m;i++){
                char x=mat[ri][rj+i];
                if((ri+1<n && mat[ri+1][rj+i]=='C')||(ri-1>=0 && mat[ri-1][rj+i]=='C')){
                   rr.append(x);
                }
            }
        }

        // var rod
        if(flag){
            for(int i=0;i<n;i++){
                char x=mat[ri+i][rj];
                if((rj+1<m && mat[ri+i][rj+1]=='C')||(rj-1>=0 && mat[ri+i][rj-1]=='C')){
                  rr.append(x);
                }
            }
        }

        for(int i=1;i<rr.length()-1;i++){
            if(rr.charAt(i)!=rr.charAt(i-1) && rr.charAt(i)!=rr.charAt(i+1)) res++;
        }
        if(rr.length()>=2 && rr.charAt(0)!=rr.charAt(rr.length()-1)) res++;
        System.out.println(res);
        sc.close();

    }
}
