class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int water = Integer.MIN_VALUE;

        while (left <= right) {
            int width = right-left;
            if (Math.min(heights[left], heights[right]) * width > water) {
                water = Math.min(heights[left], heights[right]) * width;
            }
            if (heights[left] <= heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return water;
    }
}
