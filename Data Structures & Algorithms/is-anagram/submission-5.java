class Solution {
    public boolean isAnagram(String s, String t) {

        // If lengths differ, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        // Count frequencies of characters in string s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract frequencies using string t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }

        return true;
    }
}
