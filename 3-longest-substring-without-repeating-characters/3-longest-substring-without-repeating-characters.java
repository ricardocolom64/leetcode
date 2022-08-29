class Solution {
    public int lengthOfLongestSubstring(String s) {
        String longest = "";
        String currLongest = "";
        String currStr = "";
        
        for(int i = 0; i < s.length(); ++i)
        {
            //System.out.println(currLongest);
            if(currLongest.indexOf(s.charAt(i)) != -1)
            {
                //System.out.println("currLongest -> " + currLongest);
                if(currLongest.length() > longest.length())
                    longest = currLongest;
                currLongest = currLongest.substring(currLongest.indexOf(s.charAt(i)) + 1, currLongest.length());
            }
            currLongest += s.charAt(i);
            //System.out.println("new currLongest -> " + currLongest);
            
        }
        
        //System.out.println(currLongest);
        
        if(currLongest.length() > longest.length())
            longest = currLongest;
        
        return longest.length();
    }
}