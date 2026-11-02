class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        if(nums.length == 0 || nums == null){
            return new int[]{0,0};
        }

        int[] output = new int[k];

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );

        for(int key : map.keySet()){
            maxHeap.add(key);
        }

        for(int i =0; i < k; i++){
            output[i] = maxHeap.poll();
        }

        return output;


        
    }
}
