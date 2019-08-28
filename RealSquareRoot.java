public class RealSquareRoot {

	private final static double EPSILON = 0.0001;

	private static double lsqrt(double n, double l, double m, double h) {
		double mSquared = m * m;
		if (Math.abs(mSquared - n) / mSquared <= EPSILON) {
			return m;
		}
		else {
			l = m;
			m = l + (h - l) / 2.0;
			return lsqrt(n, l, m, h);
		}
	}	

	private static double hsqrt(double n, double l, double m, double h) {
		double mSquared = m * m;
		if (Math.abs(mSquared - n) / mSquared <= EPSILON) {
			return m;
		}
		else {
			h = m;
			m = l + (h - l) / 2.0;
			return hsqrt(n, l, m, h);
		}
	}

	public static double sqrt(double num) {
		// declaring the low and high before giving them real value
		double low = 0;
		double high = 0;

		if (num < 1.0) {
			low = num;
			high = 1.0;
			double mid = low + (high - low) / 2.0;
			return lsqrt(num, low, mid, high);
		}
		else {
			low = 1.0;
			high = num;
			double mid = low + (high - low) / 2.0;
			return hsqrt(num, low, mid, high);
		}

		
	}

	public static void main(String[] args) {
		System.out.println(sqrt(69));
	}
}