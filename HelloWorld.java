

import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        HashSet<String> bharat= new HashSet<>();
        while(sc.hasNext()){
            // System.out.println(sc.next());
            bharat.add(sc.next());
        }
        //for(char cal: bharat)        
        //System.out.println(bharat);
        System.out.print("['");
        // for(String cal:bharat){
        //     System.out.print(","+cal+"'");
        // }
        for(int i=0;i<bharat.size();i++){
            System.out.print(","+bharat+"'");
        }
        System.out.print("]");
    }
}