class Solution {
    public int jump(int[] nums) {
        
        int jumps = 0;
        
        int endPos = nums.length - 1;
        int newEndPos = endPos;
        
        for(int i = endPos; i >= 0; --i)
        {
            if(nums[i] + i >= endPos)
            {
                newEndPos = i;
            }
            
            if(i == 0)
            {
                if(endPos == 0)
                    break;
                endPos = newEndPos;
                i = endPos;
                jumps++;
            }
        }
        
        //System.out.println(newEndPos);
        //System.out.println(jumps);
        
        return jumps;
        
    }
}