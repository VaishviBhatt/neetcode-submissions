class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        if( nums == null || nums.length == 0 ){
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                result[0] = map.get(compliment);
                result[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }

        return result;
        
    }
}
