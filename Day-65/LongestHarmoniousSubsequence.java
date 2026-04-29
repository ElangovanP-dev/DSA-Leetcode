import java.util.*;

class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxValue=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]-nums[j]>1){
                j++;
            }
            if(nums[i]-nums[j]==1){
                maxValue=Math.max(maxValue,i-j+1);
            }
        }
        return maxValue;
    }
}
