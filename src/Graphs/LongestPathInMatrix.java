package Graphs;
public class LongestPathInMatrix {
    public int longestIncreasingPath(int[][] matrix) {
        int col = matrix.length;
        int row = matrix[0].length;
        int maxLen = 1;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                maxLen = Math.max(maxLen, dfs(matrix, dp, i, j));
            }
        }
        return maxLen;
    }

    public int dfs(int[][] matrix, int[][] dp, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || matrix[i][j] == -1)
            return 1;
        int temp = matrix[i][j];
        int maxLen = 1;
        matrix[i][j] = -1;
        int[][] dic = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for (int[] d : dic) {
            if (i + d[0] >= 0 && j + d[1] >= 0 && i + d[0] < matrix.length && j + d[1] < matrix[0].length) {
                if (matrix[i + d[0]][j + d[1]] > temp) {
                    if (dp[i + d[0]][j + d[1]] != 0) {
                        maxLen = Math.max(maxLen, dp[i + d[0]][j + d[1]] + 1);
                    } else
                        maxLen = Math.max(maxLen, 1 + dfs(matrix, dp, i + d[0], j + d[1]));
                }
            }
        }
        matrix[i][j] = temp;
        dp[i][j] = maxLen;
        return maxLen;
    }
}