class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public int numIslands(char[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;
        int res = 0;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (grid[r][c] == '1') {
                    bfs(grid, r, c);
                    res++;
                }
            }
        }
        return res;
    }

    public void bfs(char[][] grid, int r, int c) {
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = '0';
        q.add(new int[]{r,c});

        while (!q.isEmpty()) {
            int[] node = q.poll();
            int row = node[0], col = node[1];

            for (int[] dir : directions) {
                int newRowLen = node[0] + dir[0];
                int newColLen = node[1] + dir[1]; 
                if ( newRowLen >= 0 && newColLen  >= 0 &&  newRowLen < grid.length && newColLen < grid[0].length && grid[newRowLen][newColLen] == '1') {
                    q.add(new int[]{newRowLen, newColLen});
                    grid[newRowLen][newColLen] = '0';
                }
            }
        }
    }
}
