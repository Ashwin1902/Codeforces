import java.util.Scanner;

public class Rudolfand121 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            System.out.println(helper(arr,n));
        }
    }
    static String helper(int[] arr, int n){
        int i=1;
        int j=n-2;
        while(i<=j){

               int x = arr[j + 1];
               arr[j + 1] = arr[j + 1] - x;
               arr[j] = arr[j] - (x * 2);
               arr[j - 1] = arr[j - 1] - x;

            if(arr[j-1]<0 || arr[j]<0 || arr[j+1]<0) return "NO";
            j--;

                int y = arr[i - 1];
                arr[i - 1] = arr[i-1]-y;
                arr[i] = arr[i] - (y * 2);
                arr[i + 1] = arr[i + 1] - y;
                if (arr[i - 1] < 0 || arr[i] < 0 || arr[i + 1] < 0) return "NO";

            i++;
        }
        for(int x: arr){
            if(x!=0) return "NO";
        }
   return "YES";
    }

}
