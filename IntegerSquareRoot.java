public class IntegerSquareRoot {

	// private function for calling sqrt recursively
	private static int sqrt(int n, int l, int m, int h) {

		// handles any out of bounds errors
		if (n < 0 || l < 0) {
			return -1;
		}

		if (l > h) {
			return m;
		}

		// if the sqaure root is found;
		if (n / m == m) {
			return m;
		}
		else if (n / m > m) {
			l = m + 1;
			m = l + (h - l) / 2;
			return (sqrt(n, l, m, h));
		}
		else {
			h = m - 1;
			m = l + (h - l) / 2;
			return (sqrt(n, l, m, h));
		}

	}

	// finds the int square root
	public static int sqrt(int num) {
		int low = 0;
		int high = num;
		int med = low + (high - low) / 2;
		return sqrt(num, low, med, high);

	}

	public static void main(String[] args) {
		System.out.println("test for 16: " + sqrt(16));
		System.out.println("test for 12: " + sqrt(12));
	}
}