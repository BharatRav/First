// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class Interview_problem2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][] =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        //logic part
        int pos[]={-1,-1};
        int i;
        int j;
        boolean flag=false;
        for( i=0;i<n;i++){
            for( j=0;j<n;j++) {
                if (x == arr[i][j]) {
                    pos[0] = i;
                    pos[1] = j;
                    flag = true;
                    break;  //for column's for loop
                }
            }
            if(flag){
                break;//for row's for loop
            }
        }
        if(pos[0]!=-1 && pos[1]!=-1){
            System.out.println("Found at ("+pos[0]+","+ pos[1]+")");
        }else{
            System.out.println("Not Found");
        }
    }
}