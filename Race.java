import java.util.Scanner;

public class Race {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for (int i = 0; i < t; i++) {
        int a=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    if((a-x>=1 && a-y>=1) || (x-a>=1 && y-a>=1)) System.out.println("YES");
    else System.out.println("No");
    }
    
    sc.close();
}    
    
}
