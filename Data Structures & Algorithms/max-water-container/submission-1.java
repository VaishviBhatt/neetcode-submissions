class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length -1;
        int area = 0;

        while(i < j){
            int height = Math.min( heights[i] , heights[j] );
            int width = j - i;
            int current_area = width * height;

            area = Math.max(current_area , area);

            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }

        return area;
    }
}
