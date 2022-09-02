/*

[1,2,2,3,5,6,1,3,5,7,2,6]

[1,3,5,6,1,3,5,7]

*/

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j = nums.length - 1;
        int occ = 0;
        
        if(val > 50)
            return nums.length;
        
        for(int i = 0; i < nums.length; ++i)
        {
            if(nums[i] == val)
            {
                occ++;
                while(nums[j] == val && j > 0)
                {
                    System.out.println("nums[" + j + "] is " + val);
                    --j;
                }
                nums[i] = nums[j];
                if(j > 0)
                    --j;
            }
        }
        
        return nums.length - occ;
    }
}