class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] array = cleaned.toCharArray();

        int length = array.length;

        int i = 0;

        int j = length - 1;

        while(i<j){
            if(array[i] != array[j]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
