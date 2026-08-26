class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length, COL = matrix[0].length-1;

        int top = 0, bot = ROW - 1;
        while (top <= bot) {
            int row = (top + bot) / 2;
            if (target > matrix[row][COL]) {
                top = row + 1;
            } else if (target < matrix[row][0]) {
                bot = row - 1;
            } else {
                break;
            }
        }

        if ((top > bot)) {
            return false;
        }

        int left = 0;
        int right = COL;
        int row = (top + bot) / 2;
        while (left <= right) {
            int mid = (left + right)/ 2;

            if (target == matrix[row][mid]) {
                return true;
            } else if (target > matrix[row][mid]) {
                left = mid +1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
