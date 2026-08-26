class Solution {
    public static final int[][] directions = {{1,0}, {0, 1}, {-1, 0}, {0, -1}};

    public int numIslands(char[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length; 
        int islands = 0;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == '1') {
                    bfs(i, j, grid);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void bfs (int i, int j, char[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {i, j});

        while (!queue.isEmpty()) {
            int[] vals = queue.poll();
            int r = vals[0];
            int c = vals[1];
            grid[r][c] = '0';
            for (int[] dir : directions) {
               int nr = r + dir[0];
               int nc = c + dir[1];

               if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length) {
                    if (grid[nr][nc] == '1') {
                        queue.add(new int[] {nr, nc});
                    }
               }
            }
        }
    }
}
