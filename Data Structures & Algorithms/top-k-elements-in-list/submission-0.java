class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return new int [k];
        }

        Map <Integer, Integer> map = new HashMap<>();

        for( int num : nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> map.get(b) - map.get(a)
        );

        for(int num : map.keySet()){
            maxHeap.add(num);
        }

        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            result[i] = maxHeap.poll();
        }

        return result;
    }
}
