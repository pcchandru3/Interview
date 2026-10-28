package com.pcn.interview.LeetCode75;

import java.util.HashSet;
import java.util.Set;

public class Array_ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
            if(set.contains(i))
                return true;
            set.add(nums[i]);
        }
        return false;
    }



    public boolean hasDuplicate1 (int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(!set.add(n))
                return true;
        }
        return false;
    }
}
