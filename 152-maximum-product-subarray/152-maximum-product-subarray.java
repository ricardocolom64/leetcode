class Solution {
    public int maxProduct(int[] nums) {
        
        int maxsum = nums[0];
        int cursum = 1;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            cursum = cursum * nums[i];

            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum == 0) {
                cursum = 1;
            }
        }
        cursum = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            cursum = cursum * nums[i];

            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum == 0) {
                cursum = 1;
            }
        }
        return maxsum;
        
    }
}