class Solution {
    public int maxProduct(int[] nums) {
        
        int currProd = 1;
        int maxProd = nums[0];
        
        // Kadane?
        
        for(int i = 0; i < nums.length; ++i)
        {
            currProd *= nums[i];
            
            if(currProd > maxProd)
                maxProd = currProd;
            
            if(nums[i] == 0)
                currProd = 1;
        }
        
        currProd = 1;
        
        for(int i = nums.length - 1; i > 0; --i)
        {
            currProd *= nums[i];
            
            if(currProd > maxProd)
                maxProd = currProd;
            
            if(nums[i] == 0)
                currProd = 1;
        }
        
        
//         // Brute Force
        
//         for(int i = 0; i < nums.length; ++i)
//         {
//             currProd = 1;
            
//             for(int j = i; j < nums.length; ++j)
//             {
//                 currProd *= nums[j];
                
//                 if(currProd > maxProd)
//                     maxProd = currProd;
//             }
//         }
        
        return maxProd;
        
    }
}