package Graphs;

public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon.length == 1 && dungeon[0].length == 1) {
            return Math.max(1, 1 - dungeon[0][0]);
        } else if (dungeon.length == 1 && dungeon[0].length == 2) {
            int dp1 = Math.max(1, 1 - dungeon[0][1]);
            return Math.max(1, dp1 - dungeon[0][0]);
        } else if (dungeon.length == 2 && dungeon[0].length == 2) {
            int dp[][] = new int[2][2];
            dp[1][1] = Math.max(1, 1 - dungeon[1][1]);
            dp[1][0] = Math.max(1, dp[1][1] - dungeon[1][0]);
            dp[0][1] = Math.max(1, dp[1][1] - dungeon[0][1]);
            dp[0][0] = Math.max(1, Math.min(dp[0][1], dp[1][0]) - dungeon[0][0]);
            return dp[0][0];
        }
        int row = dungeon.length;
        int col = dungeon[0].length;

        int dp[][] = new int[row][col];
        dp[row - 1][col - 1] = Math.max(1, 1 - dungeon[row - 1][col - 1]);

        for (int j = col - 2; j >= 0; j--) {
            dp[row - 1][j] = Math.max(1, dp[row - 1][j + 1] - dungeon[row - 1][j]);
        }

        for (int i = row - 2; i >= 0; i--) {
            dp[i][col - 1] = Math.max(1, dp[i + 1][col - 1] - dungeon[i][col - 1]);
        }
        for (int i = row - 2; i >= 0; i--) {
            for (int j = col - 2; j >= 0; j--) {
                int minCost = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(1, minCost - dungeon[i][j]);
            }
        }
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                System.out.print(dp[i][j]);
//            }
//            System.out.println();
//        }
        return dp[0][0];
    }
}
