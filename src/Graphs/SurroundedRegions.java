package Graphs;

public class SurroundedRegions {
    public void solve(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i == 0 || j== 0 || i == row-1 || j == col-1){
                    if(board[i][j] == 'O')
                        dfs(board,i,j);
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == 'T')
                    board[i][j] = 'O';
                else if(board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
        for(int i=0 ;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public void dfs(char[][] board ,int i,int j){
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != 'O')
            return;
        board[i][j] = 'T';
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        for(int[] d : dir){
            dfs(board,i+d[0],j+d[1]);
        }
    }
}
