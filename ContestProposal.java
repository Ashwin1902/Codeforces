import java.util.Scanner;

public class ContestProposal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(helper(n, a, b));
        }
    }

    static int helper(int n, int[] a, int[] b) {
        int res = 0;
        int ai = 0;
        int bi = 0;
        while (bi < n) {
            if (a[ai] > b[bi]) {
                res++;
                bi++;
            } else {
                ai++;
                bi++;
            }
        }
        return res;
    }
}
