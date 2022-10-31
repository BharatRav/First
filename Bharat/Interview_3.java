package Bharat;

import java.util.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/*       string  abcdbccb
        Unique - a d
        Distinct - a b c d

 */

public class Interview_3 {
    public static void unique(String str){
        Map<Character,Integer> hm= new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                int freq=hm.get(ch);
                hm.put(ch,freq+1);
            }else{
                hm.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> key: hm.entrySet()){
            if(key.getValue()==1){
                System.out.print(key+" ");
            }
        }
        System.out.println();
    }
    public static void distinct(String str){
        //code
        Map<Character,Integer> hm= new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                int freq=hm.get(ch);
                hm.put(ch,freq+1);
            }else{
                hm.put(ch,1);
            }
        }
        //System.out.println(hm);
        for(Map.Entry<Character,Integer> key: hm.entrySet()){
            System.out.print(key+" ");
        }
        System.out.println();

        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        //calling unique function to print
        unique(str);
        System.out.println("*************");
        //calling distinct function to print elements distincly
        distinct(str);

    }
}
