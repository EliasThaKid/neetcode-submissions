class Solution {
    public static final int[][] directions = {{1,0}, {0,1}, {-1, 0}, {0, -1}};
    public int maxArea = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length;

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == 1) {
                    bfs(i, j, grid);
                }
            }
        }

        return maxArea;
    }

    public void bfs (int i, int j, int[][] griddy) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {i, j});
        griddy[i][j] = 0;
        int area = 1;

        while (!queue.isEmpty()) {
            int[] val = queue.poll();
            int r = val[0];
            int c = val[1];
  
            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nr < griddy.length && nc >= 0 && nc < griddy[0].length) {
                    if (griddy[nr][nc] == 1) {
                        area++;
                        griddy[nr][nc] = 0;
                        queue.add(new int[] {nr, nc});
                        
                    }
                }
            }
        }

        maxArea = Math.max(area, maxArea);
    } 
}
