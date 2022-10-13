class Solution {
    public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
        
//         for(int i = 1 ; i < nums.length; ++i)
//         {
//             if(nums[i] - nums[i-1] != 1)
//                 return nums[i] - 1;
//         }
        
//         if(nums[nums.length - 1] == nums.length)
//             return 0;
        
//         return nums.length;
        
        int[] newArr = new int[nums.length + 1];
        
        for(int i = 0; i < nums.length; ++i)
        {
            newArr[nums[i]] = 1;
            //System.out.println("i = " + i + "\tnewArr = " + Arrays.toString(newArr));
        }
        
        for(int i = 0; i < newArr.length; ++i)
        {
            if(newArr[i] == 0)
                return i;
        }
        
        return 0;
        
        
    }
}