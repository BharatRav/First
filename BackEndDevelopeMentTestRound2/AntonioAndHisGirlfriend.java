package BackEndDevelopeMentTestRound2;

import java.util.Scanner;

/*
    Antonio and his girlfriend decided to move their relationship to the next level and bought
     a binary string S(string consisting only of characters ‘0’ and ‘1’) from a nearby string shop(name of the shop).
      As you may have already guessed, both of them are programmers.

      A nice string is a binary string which contains at least one character ‘1’.
       For example ‘101100’, ‘0100’, ‘10001’ etc. are nice strings.

    A substring of a string is a contiguous subsequence of that string.

    To impress his girlfriend Antonio wants to find the number of nice
    substrings of string S but is facing difficulties.

Given string S, help Antonio by telling him the number of nice substrings of string S.
 input 0100
 output 6       0100,010,100,01,10,1

  */
public class AntonioAndHisGirlfriend {

    private  static long charOnePresentInSubstring(String str){
        long count=0;
        int start=0;
        int end=str.length();
        while(end!=0) {
            while (start < end) {
                for (int i = start; i < end; i++) {
                    if (str.charAt(i) == '1') {
                        count++;
                        break;
                    }
                }
                start++;
            }
            start=0;
            end--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String S=sc.next();

        System.out.println(charOnePresentInSubstring(S));
    }
}
