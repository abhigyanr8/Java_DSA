package Graphs;

public class MaxAreaIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 1){
                    maxArea = Math.max(maxArea,dfs(grid,i,j));
//                    System.out.println("maxArea "  + maxArea);
//                    System.out.println("i "+i + "j "+j);
                }
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid ,int i,int j){
        if(i < 0 || i >= grid.length || j >= grid[0].length || j < 0 || grid[i][j] == 0)
            return 0;
        int sum = 1;
        grid[i][j] = 0;
        int[][] dic = {{1,0},{0,1},{-1,0},{0,-1}};
        for(int[] d : dic){
            sum += dfs(grid,i+d[0],j+d[1]);
            if(i == 3 && j == 8)
                System.out.println("sum" + sum);
        }
        return sum;
    }
}
