package com.pcn.interview.LeetCode75;

public class BinarySearch_SearchInRotatedSortedArray {
    
    public int searchRotatedSortedArray(int[] nums, int target) {

        // 4 5 6 7 0 1 2 3
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if(nums[mid] = target)
                return mid;

            if (nums[l] <= nums[mid]) {
                if()
            }
        }
    }

}








// // 1 2 3 4 5 6 7 8 9 10int 




// public int searchArracy(int[] nums, int target) {
//     for(int i=0; i<nums.length;i++){
//         if( nums[i] == target)
//             return i;
//     }
//     return -1;
// }




//n = list.length 
// for (int i=0;i<n;i++){
    // if(list(i) == target) {
    //     System.out.println("found");
    //     return i;
    // }

//}
// return -1;


// for i : range(list) :
//     if(index i = 6)
//         print found



//     print not found

