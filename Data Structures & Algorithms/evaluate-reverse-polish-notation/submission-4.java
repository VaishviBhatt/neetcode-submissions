class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0){
            return 0;
        }

        // Map <String, BinaryOperation<Integer, Integer>> map = Map.of(
        //     '+'
        // )

        Deque<Integer> stack = new ArrayDeque<>();

        for( int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } else if(tokens[i].equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push( a - b);
            }else if(tokens[i].equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push( b * a);
            }else if(tokens[i].equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push( a / b);
            }else{
            stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }
}
