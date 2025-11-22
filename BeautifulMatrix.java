import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int res=0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int x=sc.nextInt();
                if(x==1){
                    res=Math.abs(i-2)+Math.abs(j-2);
                }
            }
        }
        System.out.println(res);
    }
}
