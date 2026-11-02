class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement already exists in our map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        return new int[] { 0, 0 }; // Default return if no solution is found
    }
        
}
