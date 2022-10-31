package practice;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Temp {
    static void giveOutput(int[]arr,int n){
        Queue<Integer> qu=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<n;i++){
            qu.offer(arr[i]);
        }
        System.out.println(qu);
        //logic
        for(int day=1;day<=n;day++){   //for days
            for(int i=0;i<day;i++) {
                if (arr[i] <= qu.peek()) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            giveOutput(arr,n);
        }

    }
}