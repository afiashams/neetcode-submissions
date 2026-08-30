class Solution {
    public int maxArea(int[] heights) {

        int maxArea = 0;
        int currArea = 0;
        int start = 0;
        int end = heights.length-1;
        while( start < end ){
            currArea = (end-start) * Math.min(heights[start],heights[end]);
            if( currArea > maxArea ){
                maxArea = currArea;
            }
            if( heights[start] < heights[end]  ){
                start++;
            }
            else{
                end--;

            }

        }
        return maxArea;

        
    }
}
