import  java.util.Scanner;
public class Pattern {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        if(N>=1 && N<=100){
            for(int i=1; i<=N;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j +" ");
                }
                System.out.println();
            }

        }
    }
}
