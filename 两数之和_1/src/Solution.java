import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
//        int result[]=new int[2];
//        Arrays.sort(nums);
//        int start=0,end=nums.length-1;
//        while(start<end){
//            if(nums[start]+nums[end]>target){
//                end--;
//            }
//            else if(nums[start]+nums[end]<target){
//                start++;
//            }
//            else {
//                result[0]=start;
//                result[1]=end;
//                break;
//            }
//        }
//        return result;

        Map<Integer,Integer> map=new HashMap<>();
        int result[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                result[0]=map.get(temp);
                result[1]=i;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
