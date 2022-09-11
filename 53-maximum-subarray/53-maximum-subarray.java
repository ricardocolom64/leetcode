class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = nums[0];
        
        // for(int i = 0; i < nums.length; ++i)
        // {
        //     currSum = 0;
        //     for(int j = i; j < nums.length; ++j)
        //     {
        //         currSum += nums[j];
        //         if(currSum > maxSum)
        //             maxSum = currSum;
        //     }
        // }
        
        // Kadane's Algorithm
        
        for(int i = 0; i < nums.length; ++i)
        {
            currSum += nums[i];
            
            if(nums[i] > currSum)
                currSum = nums[i];
            
            if(currSum > maxSum)
                maxSum = currSum;
        }
        
        //System.out.println(maxSum);
        
        return maxSum;
    }
}