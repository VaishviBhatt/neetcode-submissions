class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c , map.getOrDefault( c, 0) +1);
        }

        for(char v : t.toCharArray()){
            if(map.containsKey(v)){
                int value = map.get(v);
                if(value > 0){
                    map.put(v , value -1);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
