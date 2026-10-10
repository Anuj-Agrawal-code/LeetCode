class Solution {

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                count++;
                DFS(isConnected, visited, i);
            }
        }

        return count;
    }

    public void DFS(int[][] grid, boolean[] visited, int city) {
        visited[city] = true;

        for (int j = 0; j < grid.length; j++) {
            if (grid[city][j] == 1 && !visited[j]) {
                DFS(grid, visited, j);
            }
        }
    }

}