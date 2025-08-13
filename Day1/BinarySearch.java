package com.day1to10;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {-1, 23, 45, 50, 76, 88};
		System.out.println("Enter the element to be searched:");
		int target = sc.nextInt();
		int result = binarySearch(nums, target);
		if(result!=-1) {
			System.out.println("Element found at index: " + result);
		}
		else {
			System.out.println("element not found");
		}
	}
	
	public static int binarySearch(int[] nums, int target) {
		int left = 0;
		int right = nums.length-1;
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(nums[mid] == target) {
				return mid;
			}
			else if(nums[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		return -1;
	}

}
