class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];

        if(temperatures == null || temperatures.length == 0){
            return new int[0];
        }

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length ; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int top = stack.pop();
                result[top] = i - top;
            }
            stack.push(i);
        }

        return result;
        
    }
}
