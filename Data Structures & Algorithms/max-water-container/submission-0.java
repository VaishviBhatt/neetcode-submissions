class Solution {
    public int maxArea(int[] heights) {

        int max_amount = 0;

        int i = 0;
        int j = heights.length -1;

        while(i < j){
            int width = j - i;
            int height = Math.min(heights[i], heights[j]);
            int current_area = width * height;

            max_amount = Math.max(max_amount, current_area);

            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return max_amount;
        
    }
}
