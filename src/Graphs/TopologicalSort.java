package Graphs;

import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {
    public void topologicalSort(int[][] board) {
        List<List<Integer>> adjacencyList = new ArrayList<>();
        int n = 0;
        for (int[] b : board) {
            n = Math.max(n, Math.max(b[0], b[1]));
        }
        n++;
        for (int i = 0; i < board.length; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] b : board) {
            adjacencyList.get(b[0]).add(b[1]);
        }
        for (List<Integer> a : adjacencyList) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
//    public void dfs(int element, int[][] board, List<Integer> result){
//    }
}
