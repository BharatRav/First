import java.sql.SQLOutput;
import java.util.Scanner;
public class print {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
       // int n=1;
        int marks=0;
        System.out.println("-----------------------");

        System.out.println("1: for entering marks");
        System.out.println("0: for  stop");
        System.out.println("-----------------------");
        System.out.println("Enter your choice:");
        int n=sc.nextInt();


        while(n!=0){

            System.out.println("Enter Your Marks: ");
            marks=sc.nextInt();
            if(marks>=90){
                System.out.println("This is Good");
            }else if(marks>=60){
                System.out.println("This is also Good");
            } else if (marks>=0){
                System.out.println("This is Good as well");
            }

            System.out.println("-----------------------");

            System.out.println("1: for entering marks");
            System.out.println("0: for  stop");
            System.out.println("-----------------------");
            System.out.println("Enter 1 or 0");
          //  System.out.println("Enter your choice:");
            n=sc.nextInt();

            }
        System.out.println("-----------------------");
        System.out.println("Program Ends");
        System.out.println("-----------------------");

        }
    }

