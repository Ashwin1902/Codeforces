import java.util.Scanner;

public class ProductofBinaryDecimals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] arr={0, 1, 10, 11,121, 100, 101, 110, 111, 1000, 1001, 1010, 1011, 1100, 1101, 1110, 1111, 10000, 10001, 10010, 10011, 10100, 10101, 10110, 10111,10201, 11000, 11001, 11010, 11011, 11100, 11101, 11110, 11111,12321,12100, 100000};
            int a=arr.length;
            boolean flag=false;
            for(int k=0;k<a;k++){
                for(int j=0;j<a;j++){
                    if((arr[k]*arr[j])==n) {
                        flag=true;
                    }
                }
            }
            if(flag) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
