class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxFreq = 0;
        int freqElem = -1;
        
        for(int i = 0; i < nums.length; ++i)
        {
            if(nums[i] % 2 == 0)
            {
                if(map.containsKey(nums[i]))
                {
                    //System.out.println("Has " + nums[i]);
                    map.put(nums[i], map.get(nums[i]) + 1);                    
                }
                else
                    map.put(nums[i], 1);
                    
                if(map.get(nums[i]) > maxFreq)
                {
                    maxFreq = map.get(nums[i]);
                    freqElem = nums[i];
                }
                else if(map.get(nums[i]) == maxFreq)
                {
                    if(nums[i] < freqElem)
                        freqElem = nums[i];
                }
            }
        }
        
        //System.out.println(freqElem);
        
        return freqElem;
    }
}