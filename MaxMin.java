import java.util.*;

public class MaxMin {

	// finds the max and min
	public static int[] find(ArrayList<Integer> list) {
		//inital declarations
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list.size(); ++i) {
			// max comparison
			if (list.get(i) > max) {
				max = list.get(i);
			}
			if (list.get(i) < min) {
				min = list.get(i);
			}
		}

		int[] interval = {min, max};

		return interval;
	}

	public static void main(String[] args) {

	}
}