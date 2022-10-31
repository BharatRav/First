package Collections;
import java.util.*;
public class CountDuplicate {
    public static void main(String[] args) {
        // Your code here
        Scanner sc= new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int[] arr= new int[5];
        String line[]=sc.nextLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(line[i]);
        }
        //logic part
        int count=0;
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hash.containsKey(arr[i]));
        }
    }
}
