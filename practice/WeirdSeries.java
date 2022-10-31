package practice;

import java.util.Scanner;

public class WeirdSeries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[10];
        int sum=7,i=1;
        while(sum<Integer.MAX_VALUE && i<10){
            arr[i]=sum;
            sum=7+sum*10;
            i++;
        }
        //logic part
        boolean flag=false;
        for( i=1;i<10;i++){
            if(arr[i]%num==0){
                System.out.println(i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(-1);
        }
    }
}
