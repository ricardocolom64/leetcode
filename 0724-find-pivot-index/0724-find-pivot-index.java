class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum = 0;
        int rightSum = 0;
        
        for(int i = 0; i < nums.length; ++i)
        {
            rightSum = 0;
            
            for(int j = nums.length - 1; j > i; --j)
            {
                rightSum += nums[j];
            }
            
            if(rightSum == leftSum)
                return i;
            
            leftSum += nums[i];
        }
        
        return -1;
    }
}