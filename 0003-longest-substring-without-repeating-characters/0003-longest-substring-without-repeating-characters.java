class Solution {
    public int lengthOfLongestSubstring(String s) {
        String longest = "";
        String curr = "";
        
        for(int i = 0; i < s.length(); ++i)
        {
            if(curr.indexOf(s.charAt(i)) != -1)
            {
                //System.out.println("curr, " + curr + ", contains " + s.charAt(i));
                if(curr.length() > longest.length())
                {
                    longest = curr;
                    //System.out.println("longest: " + longest);
                }
                curr = curr.substring(curr.indexOf(s.charAt(i)) + 1, curr.length());
                //System.out.println("curr after substring: " + curr);
            }
            
            curr += s.charAt(i);
            //System.out.println("Adding " + s.charAt(i) + " to curr");
        }
        
        if(curr.length() > longest.length())
            longest = curr;
        
        //System.out.println("curr after finishing: " + curr);
        //System.out.println("longest after finishing: " + longest);
        
        return longest.length();
    }
}