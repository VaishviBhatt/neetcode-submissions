class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        char[] array = s.toCharArray();

        Set<Character> set = new HashSet<>();
        int i = 0; // Left pointer

        // j is the right pointer expanding the window
        for (int j = 0; j < array.length; j++) {
            
            // While we have a duplicate, shrink the window from the left
            while (set.contains(array[j])) {
                set.remove(array[i]);
                i++;
            }

            // Now it's safe to add the new character
            set.add(array[j]);

            // Update the max window length found so far
            result = Math.max(result, j - i + 1);
        }

        return result;
    }
}