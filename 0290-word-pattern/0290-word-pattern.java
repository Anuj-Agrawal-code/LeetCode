class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> reverseMap = new HashMap<>();

        String[] words = s.split(" "); 

        if(pattern.length() != words.length)
            return false;

        for(int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            
            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(words[i]))
                    return false;
            }
            else 
            {
                if(reverseMap.containsKey(words[i]))
                    return false;

                map.put(ch, words[i]);
                reverseMap.put(words[i], ch);
            }    
            
        }
        return true;
    }
}