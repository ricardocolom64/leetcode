class Solution {
    public double myPow(double x, int n) {
        
        if(n == 0)
            return 1;
        else if(n == 1)
            return x;
        else if(n == -1)
        {
            System.out.println("ppppp");
            return 1.0 / x;
        }
        else
        {
            if(n % 2 == 1)
            {
                return myPow(x*x, n/2) * x;
            }
            else if(n % 2 == -1)
            {
                
                return myPow(x*x, n/2) * (1.0/x);
            }
            return myPow(x*x, n/2);
        }
    }
}