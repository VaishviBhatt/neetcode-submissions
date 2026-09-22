class Solution {
    public int lengthOfLongestSubstring(String s) {

        int result = 0;

        char[] array = s.toCharArray();

        for(int i = 0; i < array.length; i++){
            Set <Character> set = new HashSet<>();
            for(int j = i; j < array.length; j++){
                if(!set.contains(array[j])){
                    set.add(array[j]);
                    result = Math.max(result, set.size());
                }else{
                    break;
                }
            }
        }

        return result;
        
    }
}
