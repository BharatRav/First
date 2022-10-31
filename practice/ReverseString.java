package practice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        char res[]=str.toCharArray();
        int i=0,j=str.length()-1;
        while(i<j){
            char temp=res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;
            j--;
        }
        System.out.println(res);

    }
}
// T(n)=O(n/2);
