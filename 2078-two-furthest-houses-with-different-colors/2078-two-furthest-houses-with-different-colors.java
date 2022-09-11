class Solution {
    public int maxDistance(int[] colors) {
        int start = colors[0];
        int end = colors[colors.length - 1];
        int result = 0;
        
        for(int i = colors.length - 1; i >= 0; --i)
        {
            if(colors[i] != start)
            {
                result = i;
                break;                
            }
        }
        
        for(int i = 0; i < colors.length; ++i)
        {
            if(colors[i] != end)
            {
                if(colors.length - i > result)
                {
                    result = colors.length - 1 - i;
                    //System.out.println("asdasd " + result);
                }
                break;
            }
        }
        
        //System.out.println(result);
        
        return result;
    }
}