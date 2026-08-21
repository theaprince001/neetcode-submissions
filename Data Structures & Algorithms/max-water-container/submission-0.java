class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;

        while(left < right){
            int minH = Math.min(heights[left], heights[right]);
            int area = minH * (right - left);
            maxArea = Math.max(maxArea, area);

            while(left < right && heights[left] <= minH){
                left++;
            }
            while(left < right && heights[right] <= minH){
                right--;
            }
        }
        return maxArea;
    }
}
