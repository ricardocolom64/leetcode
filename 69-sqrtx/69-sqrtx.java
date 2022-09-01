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
            System.out.println(halfX);
            
            if(halfX * halfX > x)
            {
                lastHalf = halfX;                
                halfX = halfX / 2;                
            }
            if(halfX * halfX == x)
                done = true;
            else if(halfX * halfX <= x && (halfX+1)*(halfX+1) > x)
                done = true;
            else if(halfX * halfX < x)
            {
                System.out.println(halfX + " * " + halfX + " is too small");
                halfX = (halfX + lastHalf) / 2;
            }
            
                
        }
        
        System.out.println(halfX);
        
        return halfX;
        
        
    }
}