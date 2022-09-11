class Solution {
    public int maxAbsoluteSum(int[] nums) {
        
        int currSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];
        
        for(int i = 0; i < nums.length; ++i)
        {
            currSum += nums[i];
            
            if(nums[i] > currSum)
                currSum = nums[i];
            
            if(currSum > maxSum)
                maxSum = currSum;
        }
        
        currSum = 0;
        
        for(int i = 0; i < nums.length; ++i)
        {
            currSum += nums[i];
            
            if(nums[i] < currSum)
                currSum = nums[i];
            
            if(currSum < minSum)
                minSum = currSum;
        }
        
        //System.out.println(maxSum);
        //System.out.println(minSum);
        
        if(Math.abs(minSum) > maxSum)
            return Math.abs(minSum);
        
        return maxSum;
    }
}