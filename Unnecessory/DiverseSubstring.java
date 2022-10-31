package Unnecessory;

import java.util.HashSet;
import java.util.Scanner;

public class DiverseSubstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        HashSet<Character> hs= new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(!hs.contains(str.charAt(i))){
                hs.add(str.charAt(i));
            }
        }
        System.out.println(hs.size());
    }
}
