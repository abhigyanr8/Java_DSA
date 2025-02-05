package Graphs;
import java.util.*;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int count = 0;
        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && !visited.contains(new Pair<>(i, j))) {
                    count++;
                    queue.add(new Pair<>(i, j));
                    visited.add(new Pair<>(i, j));  // Mark as visited

                    while (!queue.isEmpty()) {
                        Pair<Integer, Integer> pair = queue.poll();
                        int a = pair.first;
                        int b = pair.second;

                        // Define the 4 possible directions (right, left, down, up)
                        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

                        for (int[] dir : directions) {
                            int newA = a + dir[0];
                            int newB = b + dir[1];

                            if (newA >= 0 && newA < grid.length && newB >= 0 && newB < grid[0].length &&
                                    grid[newA][newB] == '1' && !visited.contains(new Pair<>(newA, newB))) {
                                visited.add(new Pair<>(newA, newB));
                                queue.add(new Pair<>(newA, newB));
                            }
                        }
                    }
                }
            }
        }
        return count;
    }

    // Properly implement equals() and hashCode()
    class Pair<T, U> {
        T first;
        U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }
}
