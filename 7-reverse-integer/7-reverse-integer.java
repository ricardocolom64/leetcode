class Solution {
    public int reverse(int x) {
        
        // max -> 2147483647
        //        1534236462
        
        //        2147483412
        
        //        1534236469
        
        
        boolean isNegative = false;
        
        if(x < 0)
        {
            if(x == -2147483648)
                return 0;
            isNegative = true;
            x *= -1;
        }
        
        int max = Integer.MAX_VALUE;
        
        int currInpDigitPlace = 0;
        int currMaxDigitPlace = 9;
        
        if(x / 1000000000 > 0)
        {
            boolean greaterThanFlag = true;
            for(int i = 1; i < 10; ++i)
            {
                int currInpDigit = (x / (int)Math.pow(10, currInpDigitPlace)) % 10;
                int currMaxDigit = (max / (int)Math.pow(10, currMaxDigitPlace)) % 10;

                System.out.println(currInpDigit + "   " + currMaxDigit);
                if(currInpDigit > currMaxDigit && greaterThanFlag)
                {
                    System.out.println("Invalid number");
                    return 0;                    
                }                
                
                if(currInpDigit == currMaxDigit)
                    greaterThanFlag = true;
                else
                    greaterThanFlag = false;

                currInpDigitPlace++;
                currMaxDigitPlace--;
            }            
        }
        
        String numStr = "" + x;
        String maxStr = "" + Integer.MAX_VALUE;
        
        System.out.println(maxStr);
        
        System.out.println(Integer.MIN_VALUE);
        
        
        int first = 0;
        int last = numStr.length() - 1;
        
        char[] resultChar = new char[numStr.length()];
        
        while(first <= last)
        {
            resultChar[first] = numStr.charAt(last);
            resultChar[last] = numStr.charAt(first);
            
            first++;
            last--;
        }
        
        numStr = String.valueOf(resultChar);
        System.out.println(numStr);
        
        int result = Integer.parseInt(numStr);
        
        if(isNegative)
            result *= -1;
        
        return result;
        
        
    }
}