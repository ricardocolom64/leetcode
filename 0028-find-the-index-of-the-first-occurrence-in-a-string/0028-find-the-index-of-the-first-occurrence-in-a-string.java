class Solution {
    public int strStr(String haystack, String needle) {
        
        int currStrPos = -1;
        
        for(int i = 0; i < haystack.length(); ++i)
        {
            if(i + needle.length() > haystack.length())
                break;
            
            if(haystack.charAt(i) == needle.charAt(0))
            {
                if(haystack.substring(i, i + needle.length()).equals(needle))
                {
                    currStrPos = i;
                    break;
                }                    
                
            }
        }
        
        return currStrPos;
        
    }
}