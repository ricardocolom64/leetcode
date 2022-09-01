class Solution {
    public int mySqrt(int x) {
        int halfX = x;
        int lastHalf = x / 2;
        boolean done = false;
        
        if(x >= 2147395600)
        {
            return 46340;
        }
        
        
        halfX = 46339;
        
        while(!done)
        {            
            if(halfX * halfX > x)
            {
                lastHalf = halfX;                
                halfX = halfX / 2;                
            }
            else if(halfX * halfX == x)
                return halfX;
            else if(halfX * halfX <= x && (halfX+1)*(halfX+1) > x)
                return halfX;
            else
            {
                halfX = (halfX + lastHalf) / 2;
            }
            
                
        }
        
        return halfX;
        
        
    }
}