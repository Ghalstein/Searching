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

		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(31);
		list.add(-9);
		list.add(42);
		list.add(-24);
		list.add(30);
		System.out.println(Arrays.toString(find(list)));
	}
}