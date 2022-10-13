class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length == 1)
        {
            if(nums[0] == 1)
                return 0;
        }
        
        for(int i = 1 ; i < nums.length; ++i)
        {
            if(nums[i] - nums[i-1] != 1)
                return nums[i] - 1;
        }
        
        if(nums[nums.length - 1] == nums.length)
            return 0;
        
        return nums.length;
    }
}