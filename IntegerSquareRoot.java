public class IntegerSquareRoot {

	// private function for calling sqrt recursively
	private static int sqrt(int n, int l, int m, int h) {

		// handles any out of bounds errors
		if (n < 0 || l < 0 || l > h) {
			return -1;
		}

		// if the sqaure root is found;
		if (n / m == m) {
			return m;
		}
		else if (n / m > m) {
			l = m + 1;
			m = l + h (h - l) / 2;
		}

	}

	// finds the int square root
	public static int sqrt(int num) {
		int low = 0;
		int high = int;
		int med = low + (high - low) / 2;
		return sqrt(num, low, med, high);

	}

	public static void main(String[] args) {

	}
}