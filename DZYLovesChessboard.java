import java.util.Scanner;

public class DZYLovesChessboard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        char[][] arr=new char[n][m];
        for (int i = 0; i < n; i++) {
            String x=sc.next();
            for (int j = 0; j < m; j++) {
                arr[i][j]= x.charAt(j);
            }
        }
        boolean[][] isVis=new boolean[n][m];
        int c=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]=='.' && !isVis[i][j]) helper(n,m,arr,i,j,isVis,c);
                c=(c+1)%2;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    static void helper(int n,int m,char[][] arr,int i,int j,boolean[][] isVis, int c){
        if(i>=n || i<0 || j>=m || j<0) return;
        if(isVis[i][j] || arr[i][j]!='.') return;
        isVis[i][j]=true;
        if(c==0) arr[i][j]='B';
        else arr[i][j]='W';
        int c2=(c+1)%2;
        helper(n,m,arr,i+1,j,isVis,c2);
        helper(n,m,arr,i-1,j,isVis,c2);
        helper(n,m,arr,i,j+1,isVis,c2);
        helper(n,m,arr,i,j-1,isVis,c2);
    }
}
