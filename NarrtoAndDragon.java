import java.util.Scanner;

public class NarrtoAndDragon {
    public static void main(String[] args) {
        /*Natsu is fighting with a dragon
        Dragor--> Health 'A'        && Attack  'B'
        Natsu--> Health 'C'         && Attack  'D'
        First Natsu attack the Dragon then
        Dragon will attack Natsu
         */
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int D=sc.nextInt();
        //int result=0;       //assuming dragon may win

        while(A>0 && C>0){
            A=A-D;      //natsu attack
            C=C-B;      //dragon Attack
        }
        System.out.print((A>C)?0:1);
    }
}
