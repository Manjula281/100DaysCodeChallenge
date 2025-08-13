package com.day1to10;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = {4, 12, 3, -1, 9, 23};
		System.out.println("Enter the element to be searched:");
		int target = sc.nextInt();
		int result = linearSearch(nums, target);
		if(result != -1) {
			System.out.println("Element found at index: " + result);
		}
		else {
			System.out.println("element not found");
		}
	}
	
	
	public static int linearSearch(int[] nums, int target) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
