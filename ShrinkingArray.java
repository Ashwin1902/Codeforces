import java.util.Scanner;

public class ShrinkingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        outer:
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            for(int j=1;j<n;j++){
                if(Math.abs(arr[j]-arr[j-1])<=1){
                    System.out.println(0);
                    continue outer;
                }
            }
            if(n==2){
                if(Math.abs(arr[0]-arr[1])>=2){
                    System.out.println(-1);  
                }
                else{
                    System.out.println(0);
                }
            }
            
            else{
            boolean asc=true;
            boolean dsc=true;
            for(int k=0;k<n-1;k++){
                if(arr[k]-arr[k+1]>0){
                   asc=false;
                }
                else dsc=false;
            }
            if(!asc && !dsc) System.out.println(1);
            else System.out.println(-1);
        }
        }
        sc.close();
    }
    
}
