package top_problems.arrays;

import java.util.Arrays;

public class EqualRowAndColumn {

	public static void main(String[] args) {
		int[][] grid = { { 3, 1, 2, 2 }, { 1, 4, 4, 5 }, { 2, 4, 2, 2 }, { 2, 4, 2, 2 } };
		int equals = equalPairs(grid);
		for (int i = 0; i < grid.length; i++) {
			System.out.println(Arrays.toString(grid[i]));
		}
		System.out.println("Equal no. of pairs: " + equals);
	}

	private static int equalPairs(int[][] grid) {
		int n = grid.length;
		int[][] temp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(grid[i][j] + "~" + grid[j][i] + "    ");
				temp[i][j] = grid[j][i];
			}
			System.out.println();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			String row = Arrays.toString(grid[i]);
			for (int j = 0; j < n; j++) {
				String col = Arrays.toString(temp[j]);
				System.out.print(row + " " + col + " " + row.equals(col) + " ");
				if (row.equals(col))
					count++;
			}
			System.out.println();
		}
		return count;
	}

}
