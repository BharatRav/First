import java.util.*;
public class ChallengeInterviewprb2 {
    /*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Example 1:

Input: nums1 = [1,3], nums2 = [2]

Output: 2.00000

Explanation: merged array = [1,2,3] and median is 2.

Example 2:

Input: nums1 = [1,2], nums2 = [3,4]

Output: 2.50000

Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int nums1[]= new int[n1];
        int nums2[] = new int[n2];
        for(int i=0;i<n1;i++){
            nums1[i]=sc.nextInt();
        }
        for(int j=0;j<n2;j++){
            nums2[j]=sc.nextInt();
        }
        int i=0;   //size of first array
        int j=0;    //size of second array
        int k=0;    //indexing purpose for storing nums1 and nums2
        int result[]= new int[n1+n2];
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                result[k]=nums1[i];
                i++;
            }else{
                result[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            result[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n2){
            result[k]=nums2[j];
            j++;
            k++;
        }
        for(int p=0;p<result.length;p++){
            System.out.print(result[p]+" ");

        }
        System.out.println();
        // logic for question
        int val= result.length;
        float even_ans;
        if(val%2==0){
             even_ans=(float)(result[val]+result[val+1])/2;
             even_ans/=val;
        }else{
            even_ans=result[val];

        }
        System.out.println(even_ans);
    }
}
