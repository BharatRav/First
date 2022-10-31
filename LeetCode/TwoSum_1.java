import java.util.HashMap;
import java.util.Map;

class TwoSum_1 {
    public int[] twoSum(int[] nums, int target) {
        int res[]=new int[2];
        Map<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                res[0]=i;
                res[1]=hm.get(target-nums[i]);
                return res;
            }
            hm.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
