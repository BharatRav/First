public class Triplets {
    /*You are given an array. Find triplets(three numbers) in the array whose sum is equal to K

I/p: 1,2,3,4,5,6 K= 9 O/p: 1,2,6 1,3,5 2,3,4

Explanation: In the given array there are three triplets 1,2,6 1,3,5 and 2,3,4 whose sum is equal to K(9).
*/
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6};
        int target=9;
        //int []triplet={0,0,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++) {
                    if((arr[i]+arr[j]+arr[k])==target){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
        //t(n) = n^3;
    }
}
