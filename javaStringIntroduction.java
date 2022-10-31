import java.util.Locale;
import java.util.Scanner;

public class javaStringIntroduction {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        //first output
        //print sum of length of both string
        System.out.println(str1.length()+str2.length());

        //second line output....alphabetically/lexicographically who is greter ranking in dictionary
        // A has or not
        boolean flag=true;
        for(int i=0;i<Math.min(str1.length(),str2.length());i++){
            if(str1.charAt(i)<str2.charAt(i))
                flag = false;
                break;

        }
        System.out.println((flag)?"Yes":"No");



        //third line output
        //print first letter capital
        //print both with first letter capital
        System.out.print(str1.substring(0,1).toUpperCase()+ str1.substring(1).toLowerCase()+ " ");
        System.out.println(str2.substring(0,1).toUpperCase()+str2.substring(1).toLowerCase());



    }
}
/*Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java*/
