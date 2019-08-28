import java.util.*;

public class MatrixSearch {

	public static boolean find(ArrayList<ArrayList<Integer>> matrix, int n) {

		// initial rows and columns for the search
		int row = 0;
		int col = matrix.get(0).size() - 1;

		while (row < matrix.size() && col >= 0) {
			if (matrix.get(row).get(col) < n) {
				++row;
			}
			else if (matrix.get(row).get(col) > n) {
				--col;
			}
			else {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {

	}
}