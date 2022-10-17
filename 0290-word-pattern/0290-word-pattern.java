class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] dict = new String[26];
        HashMap<String, Character> smap = new HashMap<>();
        Arrays.fill(dict, "");
        
        String[] arr = s.split(" ");
        
        if(pattern.length() != arr.length)
            return false;
        
        for(int i = 0; i < pattern.length(); ++i)
        {
            int dictPos = pattern.charAt(i) - 'a';
            
            // If the string key gives the appropriate value
            if(!smap.containsKey(arr[i]))
            {
                smap.put(arr[i], pattern.charAt(i));
            }
            else
            {
                if(smap.get(arr[i]) != pattern.charAt(i))
                    return false;
            }
            
            if(dict[dictPos].equals("") || dict[dictPos].equals(arr[i]))
            {
                dict[dictPos] = arr[i];
            }
            else
            {
                return false;
            }
        }
        
        return true;
    }
}