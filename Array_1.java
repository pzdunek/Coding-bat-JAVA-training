package Codingbat;

import java.util.Arrays;

public class Array_1 {

	// Given an array of ints, return true if 6 appears as either the first or
	// last element in the array.
	// The array will be length 1 or more.
	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
			return true;
		} else
			return false;
	}

	// Given an array of ints, return true if the array is length 1 or more, and
	// the
	// first element and the last element are the same.
	public boolean sameFirstLast(int[] nums) {
		if (nums.length >= 1 && (nums[0] == nums[nums.length - 1])) {
			return true;
		} else
			return false;
	}

	// Return an int array length 3 containing the first 3 digits of pi, {3, 1,
	// 4}.
	public int[] makePi() {
		int m[] = { 3, 1, 4 };

		return m;
	}

	// Given 2 arrays of ints, a and b, return true if they have the same first
	// element or they have the same last element.
	// Both arrays will be length 1 or more.
	public boolean commonEnd(int[] a, int[] b) {
		if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
			return true;
		} else
			return false;
	}

	// Given an array of ints length 3, return the sum of all the elements.
	public int sum3(int[] nums) {

		return nums[0] + nums[1] + nums[2];
	}

	// Given an array of ints length 3, return an array with the elements
	// "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	public int[] rotateLeft3(int[] nums) {

		int[] rotated = { nums[1], nums[2], nums[0] };
		return rotated;

	}

	// Given an array of ints length 3, return a new array with the elements in
	// reverse order,
	// so {1, 2, 3} becomes {3, 2, 1}.
	public int[] reverse3(int[] nums) {

		int[] ciag = { nums[2], nums[1], nums[0] };

		return ciag;
	}

	// Given an array of ints length 3, figure out which is larger between the
	// first and last elements
	// in the array, and set all the other elements to be that value. Return the
	// changed array.
	public int[] maxEnd3(int[] nums) {

		int max = 0;

		if (nums[0] > nums[2])
			max = nums[0];
		else
			max = nums[2];

		nums[0] = max;
		nums[1] = max;
		nums[2] = max;
		return nums;

	}

	// Given an array of ints, return the sum of the first 2 elements in the
	// array.
	// If the array length is less than 2, just sum up the elements that exist,
	// returning 0 if the array is length 0.
	public int sum2(int[] nums) {
		if (nums.length >= 2) {
			return nums[0] + nums[1];
		} else if (nums.length < 2 && nums.length > 0) {
			return nums[0];
		} else
			return 0;

	}

	// Given 2 int arrays, a and b, each length 3, return a new array length 2
	// containing their middle elements.
	public int[] middleWay(int[] a, int[] b) {

		int first = a[1];
		int second = b[1];
		int x[] = { first, second };

		return x;
	}

	// Given an array of ints, return a new array length 2 containing the first
	// and last
	// elements from the original array. The original array will be length 1 or
	// more.
	public int[] makeEnds(int[] nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];

		int[] result = { first, last };

		return result;

	}

	// Given an int array length 2, return true if it contains a 2 or a 3.
	public boolean has23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2) {
			return true;
		} else if (nums[0] == 3 || nums[1] == 3) {
			return true;
		} else {
			return false;
		}
	}

	// Given an int array length 2, return true if it does not contain a 2 or 3.
	public boolean no23(int[] nums) {
		if (nums[0] == 2 || nums[1] == 2) {
			return false;
		} else if (nums[0] == 3 || nums[1] == 3) {
			return false;
		} else {
			return true;
		}

	}

	// Given an int array, return a new array with double the length where its
	// last element is the same as
	// the original array, and all the other elements are 0. The original array
	// will be length 1 or more.
	// Note: by default, a new int array contains all 0's.

	public int[] makeLast(int[] nums) {
		int[] newArray = new int[nums.length * 2];

		newArray[newArray.length - 1] = nums[nums.length - 1];

		return newArray;
	}

	// Given an int array, return true if the array contains 2 twice, or 3
	// twice.
	// The array will be length 0, 1, or 2.
	public boolean double23(int[] nums) {
		if ((nums.length > 1) && nums[0] == 2 && nums[1] == 2) {
			return true;
		} else if ((nums.length > 1) && nums[0] == 3 && nums[1] == 3) {
			return true;
		} else
			return false;
	}

	// Given an int array length 3, if there is a 2 in the array immediately
	// followed by a 3,
	// set the 3 element to 0. Return the changed array.
	public int[] fix23(int[] nums) {

		int[] newArray = new int[3];
		newArray = nums;

		if (nums[0] == 2 && nums[1] == 3) {
			newArray[1] = 0;
		} else if (nums[1] == 2 && nums[2] == 3) {
			newArray[2] = 0;
		}

		return newArray;
	}

	// Start with 2 int arrays, a and b, of any length.
	// Return how many of the arrays have 1 as their first element.
	public int start1(int[] a, int[] b) {

		int count = 0;
		if (a.length >= 1 && a[0] == 1)
			count += 1;
		if (b.length >= 1 && b[0] == 1)
			count += 1;
		return count;
	}

	// Start with 2 int arrays, a and b, each length 2.
	// Consider the sum of the values in each array. Return the array which has
	// the largest sum.
	// In event of a tie, return a.
	public int[] biggerTwo(int[] a, int[] b) {

		int first = a[0] + a[1];
		int second = b[0] + b[1];
		if (second > first) {
			return b;
		} else
			return a;

	}

	// Given an array of ints of even length, return a new array length 2
	// containing the middle
	// two elements from the original array. The original array will be length 2
	// or more.
	public int[] makeMiddle(int[] nums) {

		int[] newArray = { nums[nums.length / 2 - 1], nums[nums.length / 2] };
		if (nums.length == 2) {
			return nums;
		} else {
			return newArray;
		}
	}

	// Given 2 int arrays, each length 2, return a new array length 4 containing
	// all their elements.
	public int[] plusTwo(int[] a, int[] b) {

		int[] c = { a[0], a[1], b[0], b[1] };
		return c;
	}

	// Given an array of ints, swap the first and last elements in the array.
	// Return the modified array. The array length will be at least 1.
	public int[] swapEnds(int[] nums) {

		int[] newArray = nums;
		int zero = nums[0];
		int last = nums[nums.length - 1];

		newArray[0] = last;
		newArray[newArray.length - 1] = zero;

		if (nums.length <= 2) {
			return nums;
		} else
			return newArray;

	}

	// Given an array of ints of odd length, return a new array length 3
	// containing the elements from
	// the middle of the array. The array length will be at least 3.
	public int[] midThree(int[] nums) {

		int[] newArray = { nums[(nums.length / 2) - 1], nums[(nums.length / 2)], nums[(nums.length / 2) + 1] };

		if (nums.length < 4) {
			return nums;
		} else {
			return newArray;
		}

	}

	// Given an array of ints of odd length, look at the first, last, and middle
	// values in
	// the array and return the largest. The array length will be a least 1.
	public int maxTriple(int[] nums) {

		int[] newArray = { nums[0], nums[nums.length / 2], nums[nums.length - 1] };

		Arrays.sort(newArray);
		int max = newArray[newArray.length - 1];

		return max;
	}

	// Given an int array of any length, return a new array of its first 2
	// elements.
	// If the array is smaller than length 2, use whatever elements are present.
	public int[] frontPiece(int[] nums) {

		if (nums.length < 2) {
			return nums;
		} else {
			int[] newArray = { nums[0], nums[1] };
			return newArray;
		}
	}

	// We'll say that a 1 immediately followed by a 3 in an array is an
	// "unlucky" 1.
	// Return true if the given array contains an unlucky 1 in the first 2 or
	// last 2 positions in the array.
	public boolean unlucky1(int[] nums) {

		int len = nums.length;

		if (len >= 2) {

			if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)) {
				return true;
			} else if (nums[len - 1 - 1] == 1 && nums[len - 1] == 3) {
				return true;
			}
		}

		if (len - 1 == 1) {

			if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// Given 2 int arrays, a and b, return a new array length 2 containing, as
	// much as will fit,
	// the elements from a followed by the elements from b.
	// The arrays may be any length, including 0, but there will be 2 or more
	// elements available between the 2 arrays.
	public int[] make2(int[] a, int[] b) {

		if (a.length >= 2) {
			int[] newArray = { a[0], a[1] };
			return newArray;
		} else if (a.length == 1) {
			int[] newArray = { a[0], b[0] };
			return newArray;
		} else {
			int[] newArray = { b[0], b[1] };
			return newArray;
		}
	}

	// Given 2 int arrays, a and b, of any length, return a new array with the
	// first element of each array.
	// If either array is length 0, ignore that array.
	public int[] front11(int[] a, int[] b) {
		int[] nothing = {};

		if (a.length == 0 && b.length == 0) {
			return nothing;
		}
		if (a.length >= 1 && b.length >= 1) {
			int[] result = { a[0], b[0] };
			return result;
		} else if (a.length < 1 || b.length < 1) {

			if (a.length == 0) {
				int[] result = { b[0] };
				return result;
			} else {
				int[] result = { a[0] };
				return result;
			}
		}
		return nothing;
	}

}
