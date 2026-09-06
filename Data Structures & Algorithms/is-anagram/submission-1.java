class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() == 0 || t.length() == 0 || s == null || t== null || s.length() != t.length()){
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for (char x : t.toCharArray()){
            if(!map.containsKey(x)){
                return false;
            }else{
                int value = map.get(x);
                int newVal = value - 1;
                if(newVal < 0){
                    return false;
                }else{
                    map.put(x,newVal);
                }
            }
        }
        return true;
    }
}
