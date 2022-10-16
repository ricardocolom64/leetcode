class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(target > nums[nums.length - 1])
            return nums.length;
        
        if(target < nums[0])
            return 0;
        
        int pos = 0;
        
        for(int i = 0; i < nums.length; ++i)
        {
            if(nums[i] == target)
                return i;
            
            else if (i > 0)
                if(target > nums[i - 1])
                    pos = i;
        }
        
        return pos;
    }
}