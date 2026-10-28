package com.pcn.interview.LeetCode75;

public class BinarySearch_MinimumInRotatedSortedArray {

    // Given the sorted rotated array nums of unique elements, return
    // the minimum element of this array.
    // You must write an algorithm that runs in O(log n) time.
    // Input: nums = [3,4,5,1,2]
    // Output: 1
    // Explanation: The original array was [1,2,3,4,5] rotated 3 times.


    public int findMinimum(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low)/2;
            if(nums[mid] > nums[high])
                low = mid +1;
            else
                high = mid;
        }
        return nums[low];
    }

}
