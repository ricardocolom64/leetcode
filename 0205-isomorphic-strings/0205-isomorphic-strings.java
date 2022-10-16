class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        
        for(int i = 0; i < s.length(); ++i)
        {
            if(smap.containsKey(s.charAt(i)))
            {
                //System.out.println("smap contains " + s.charAt(i) + "\tval: " + smap.get(s.charAt(i)));
                if(smap.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            if(tmap.containsKey(t.charAt(i)))
            {
                //System.out.println("tmap contains " + t.charAt(i) + "\tval: " + tmap.get(t.charAt(i)));
                if(tmap.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }
            smap.put(s.charAt(i), t.charAt(i));
            //System.out.println("smap: " + s.charAt(i) + "\tval: " + t.charAt(i));
            tmap.put(t.charAt(i), s.charAt(i));
            //System.out.println("tmap: " + t.charAt(i) + "\tval: " + s.charAt(i));
        }
        
        //System.out.println("All characters mapped");
        
        for(int i = 0; i < s.length(); ++i)
        {
            if(smap.get(s.charAt(i)) != t.charAt(i))
               return false;
        }
        
        return true;
        
    }
}