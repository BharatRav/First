class Solution {
    public boolean isPalindrome(int x) {
        //_____Method-1______
        // if(x<=-1){
        //     return false;
        // }
        // char[] nums=(""+x).toCharArray();       //it will add ascii values
        // int left=0;
        // int right=nums.length-1;
        // boolean flag=true;                      //assume than gven number is palindrome
        // while(left<right){
        //     if(nums[left]!=nums[right]){
        //         flag=false;
        //         break;
        //     }
        //     left++;
        //     right--;
        // }
        // return flag;


        //_____method-2_____
        if(x<=-1){
            return false;
        }
        int old_value=x;
        int revNum=0;
        while(x>0){
            revNum=revNum*10+x%10;
            x/=10;
        }
        if(revNum==old_value){
            return true;
        }else{
            return false;
        }
    }
}
