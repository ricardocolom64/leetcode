class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26)
            return false;
        int[] letterAppears = new int[26];
        
        for(int i = 0; i < sentence.length(); ++i)
        {
            letterAppears[sentence.charAt(i) - 'a'] = 1;
        }
        
        for(int i = 0; i < letterAppears.length; ++i)
        {
            if(letterAppears[i] == 0)
                return false;
        }
        
        return true;
    }
}