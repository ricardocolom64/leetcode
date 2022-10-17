class Solution {
    
    public int climbStairs(int n) {
        
        if(n == 1)
            return 1;
        
        int p1 = 1;
        int p2 = 1;
        
        for(int i = n; i > 1; --i)
        {
            int sum = p1 + p2;            
            
            p2 = p1;
            p1 = sum;
        }
        
        return p1;
    }
}