class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];

        if(temperatures.length == 0){
            return result;
        }
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length; i++){
        
            while(!stack.isEmpty() && temperatures[stack.peek()]<  temperatures[i]){
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex;
            }
            stack.push(i);
    
        }
        
        return result;
        
    }
}
