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
            if(nums[i] > nums[i] + currSum)
                currSum = nums[i];
            else
                currSum = nums[i] + currSum;
            
            if(currSum > maxSum)
                maxSum = currSum;
        }
        
        System.out.println(maxSum);
        
        //System.out.println(maxSum);
        
        return maxSum;
    }
}