class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0;
        
//         for(int i = 0; i < height.length - 1; ++i)
//         {
//             //int currObserved = 0;
//             for(int j = height.length - 1; j > i; --j)
//             {
//                 int currArea = Math.min(height[i], height[j]) * (j - i);
//                 //System.out.println("i: " + i + "\tj: " + j + "\tcurrArea: " + currArea);
                
//                 if(currArea > maxArea)
//                     maxArea = currArea;
                
//                 //currObserved++;
//             }
            
//             //System.out.println("currObserved" + currObserved);
//         }
        
        
        int left = 0;
        int right = height.length - 1;
        
        while(left < right)
        {
            //System.out.println("left: " + left + "\tright: " + right);
            int currArea = Math.min(height[left], height[right]) * (right - left);
            //System.out.println("currArea: " + currArea);
            
            if(height[left] > height[right])
            {
                right--;
            }
            else
            {
                left++;
            }
            
            if(currArea > maxArea)
            {
                maxArea = currArea;
                //System.out.println("maxArea now: " + maxArea);
            }                
        }
        
        return maxArea;
    }
}