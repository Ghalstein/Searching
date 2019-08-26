/**************************************
Assumes that the array is already sorted.
Binary search traversal through the array 
to find the element that mataches index.
****************************************/

import java.util.*;

public class ElementEqualsIndex {

	private static int search(ArrayList<Integer> arr, int l, int m, int h) {
		
	}

	public static int search(ArrayList<Integer> arr) {
		int high = arr.size() - 1;
		int low = 0;
		int med = low + (high - low) / 2;
		return search(arr, low, med, high);
	}

	public static void main(String[] args) {

	}
}