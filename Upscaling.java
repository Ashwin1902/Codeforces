import java.util.Scanner;

public class Upscaling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            StringBuilder s1=new StringBuilder();
            StringBuilder s2=new StringBuilder();
            for(int j=0;j<n;j++){
                if(j%2==0) s1.append("##");
                else s1.append("..");
            }
            for(int j=0;j<n;j++){
                if(j%2==0) s2.append("..");
                else s2.append("##");
            }
            for(int j=0;j<n;j++){
                if(j%2==0) {
                    System.out.println(s1);
                    System.out.println(s1);
                }
                else{
                    System.out.println(s2);
                    System.out.println(s2);
                }
            }
        }
    }
}
