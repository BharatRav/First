package Unnecessory;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //given that n-1 are to be taken from console
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int xor=arr[0];
        for(int i=1;i<n-1;i++){
            xor=(xor^arr[i]);
        }
        int i=1;
        while(xor!=0){
            xor=xor^i;
            i++;
        }
        System.out.println(i);

    }
}
