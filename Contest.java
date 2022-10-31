import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc>0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //logic

            while(d-->0){
                int extra=arr[0];
                for(int i=1;i<n;i++){
                    arr[i-1]=arr[i];
                }
                arr[n-1]=extra;
            }
            //for print answer
            for(int val:arr)
                System.out.print(val+" ");
            tc--;
        }
    }
}
