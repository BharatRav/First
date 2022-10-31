import java.util.Arrays;
import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++) {
            b[j] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int MinValue=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<MinValue);
            MinValue=a[i];
        }
        int MaxValue=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>MaxValue);
            MaxValue=a[i];
        }
        int result=MaxValue-MinValue;
        System.out.println(result);
    }
}
