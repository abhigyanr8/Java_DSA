package Graphs;
    /*
     * Problem: Word Search
     * Given an m x n board of characters and a word, check if the word exists in the board.
     * The word must be constructed from sequentially adjacent letters (horizontally or vertically).
     * The same letter cell cannot be used more than once.
     *
     * Solution Approach:
     * - Iterate through the board to find the first character of the word.
     * - Use DFS (Depth-First Search) with backtracking to explore all four directions.
     * - Temporarily mark visited cells and restore them after recursion.
     * - Use an index instead of substring() to optimize memory usage.
     *
     * Time Complexity:
     * - Worst Case: O(m * n * 4^L), where:
     *   - m = number of rows in the board
     *   - n = number of columns in the board
     *   - L = length of the word
     * - Each cell has at most 4 recursive calls, leading to an exponential time complexity.
     */
public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int col = board.length;
        int row = board[0].length;

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word,0))
                        return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, String word, int index) {
        if (word.length() == index)
            return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index))
            return false;
        int[][] dic = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        char temp = board[i][j];
        board[i][j] = '0';
        for (int[] d : dic) {
            if (dfs(board, i + d[0], j + d[1], word,index+1))
                return true;
        }
        board[i][j] = temp;
        return false;
    }
}
