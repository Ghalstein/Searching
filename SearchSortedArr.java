import java.util.*;

public class SearchSortedArr {

	//recursive binary search
	private static int search(ArrayList<Integer> arr, int t, int l, int m, int h) {
		if (arr.get(m) < t) {
			l = m + 1;
			m = l + (h - l) / 2;
			return search(arr, t, l, m, h);
		}
		else if (arr.get(m) == t) {
			return m;
		}
		else {
			h = m - 1;
			m = l + (h - l) / 2;
			return search(arr, t, l, m, h);
		}
	}

	// inital call to the binary search
	public static int search(ArrayList<Integer> arr, int target) {
		int high = arr.size() - 1;
		int low = 0;
		int med = low + (high - low) / 2;
		return search(arr, target, low, med, high);
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		arr.add(7);
		System.out.println(search(arr, 3));
	}
}