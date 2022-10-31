import java.io.*;
import java.util.HashSet;
 
import java.util.Scanner;
public class Sample{
    public static void main(String []args){
        int count=0;
        Scanner scan=new Scanner(System.in);
        int number=1;//non zero number
        int[] arr =new int[100];
        while( number!=0){
             number=scan.nextInt();
            arr[count]=number;
            count++;
        }

        for(int j=0;j<count;j++){
            System.out.print(arr[j] + " ");
        }
    }
 }
