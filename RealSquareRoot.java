public class RealSquareRoot {

	public static double sqrt(double num) {
		// declaring the low and high before giving them real value
		double low = 0;
		double high = 0;

		if (num < 1.0) {
			low = num;
			high = 1.0;
		}
		else {
			low = 1.0;
			high = num;
		}

		double mid = low + (high - low) / 2.0;

		sqrt(num, low, mid, high);
	}

	public static void main(String[] args) {
		System.out.println(sqrt(69));
	}
}