package com.simplilearn.assessment;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int arrLen = arr.length;
		for (int i = 0; i < arrLen; i++) {
			arr[i] = (int) (Math.random() * (100 - 1 + 1) + 1);
		}
		System.out.print("Array: {");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.println(arr[i] + "}");
		}
		
		int lis = longIncrSeq(arr, arrLen);
		System.out.println("\nLongest increasing subsequence is : " + lis);
	}

	private static int longIncrSeq(int[] arr, int len) {
		int sArr[] = new int[len];
		int i, j, max = 1;
		
		for (i = 0; i < len; i++)
			sArr[i] = 0;

		for (i = 1; i < len; i++) {
			for (j = 0; j < i; j++) {
				if (arr[i] > arr[j] && sArr[i] < sArr[j] + 1) {
					// System.out.println(arr[i]);
					sArr[i] = sArr[j] + 1;
				}
			}
		}

		for (i = 0; i < len; i++) {
			if (max < sArr[i])
				max = sArr[i];
		}

		return max;
	}

}
