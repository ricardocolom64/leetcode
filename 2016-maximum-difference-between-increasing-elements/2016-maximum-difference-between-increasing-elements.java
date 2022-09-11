class Solution {
    public int maximumDifference(int[] nums) {
        
        if(nums.length < 2)
            return -1;
        
        int min = nums[0];
        int maxDiff = 0;
        
        for(int i = 0; i < nums.length; ++i)
        {
            if(nums[i] - min > maxDiff)
                maxDiff = nums[i] - min;
            if(nums[i] < min)
                min = nums[i];
        }
        
        if(maxDiff == 0)
            return -1;
        return maxDiff;
            
    }
}