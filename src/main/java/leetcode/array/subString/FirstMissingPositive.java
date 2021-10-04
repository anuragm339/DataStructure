package leetcode.array.subString;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

/*
Given an unsorted integer array nums, return the smallest missing positive integer.

You must implement an algorithm that runs in O(n) time and uses constant extra space.



Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1


Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1

 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        boolean arr[] = new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(x>0 && x<arr.length){
                arr[x]=Boolean.TRUE;
            }
        }
        System.out.println(Arrays.toString(arr));
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==Boolean.FALSE){
                count=i;
                break;
            }
        }
        if(count==0){
            return arr.length;
        }else {
            return count;
        }
    }

    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive= new FirstMissingPositive();
        Assertions.assertEquals(2,firstMissingPositive.firstMissingPositive(new int[]{1}));
    }
}
