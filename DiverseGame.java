import java.util.Scanner;

public class DiverseGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] mat = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    mat[j][k] = sc.nextInt();
                }
            }
            if(n==1 && m==1){
                System.out.println("-1");
            }
            else {

                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < m; k++) {
                        if (mat[j][k] == n * m) System.out.print(1+" ");
                        else System.out.print(mat[j][k]+1+" ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
