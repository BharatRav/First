import java.util.Scanner;

//Ques:- print a pattern
//   1              where row =n eg 4
//  222
// 33333
//4444444
public class Star {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();        // no. of rows      congrats guys

        for(int i=1; i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print(i);
            }
            System.out.println();

            }
        }
    }

