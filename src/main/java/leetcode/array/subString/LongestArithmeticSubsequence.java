package leetcode.array.subString;

import java.util.HashMap;
import java.util.Map;

/*
Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
Recall that a subsequence of an array nums is a list nums[i1], nums[i2], ..., nums[ik] with 0 <= i1 < i2 < ... < ik <= nums.length - 1, and that a sequence seq is arithmetic if seq[i+1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
Example 1:

Input: nums = [3,6,9,12]
Output: 4
Explanation:
The whole array is an arithmetic sequence with steps of length = 3.
Example 2:

Input: nums = [9,4,7,2,10]
Output: 3
Explanation:
The longest arithmetic subsequence is [4,7,10].
Example 3:

Input: nums = [20,1,15,3,10,5,8]
Output: 4
Explanation:
The longest arithmetic subsequence is [20,15,10,5].


Constraints:

2 <= nums.length <= 1000
0 <= nums[i] <= 500

 */
public class LongestArithmeticSubsequence {
    public int longestArithSeqLength(int[] nums) {
        int[][] dp = new int[nums.length][1001];
        int ans = 0;
        for (int i=0; i<nums.length; i++) {
            int cur = nums[i];
            for (int j=0; j<i; j++) {
                int prev = nums[j];
                int diff = cur - prev + 500; // offset
                int len = dp[j][diff] == 0 ? 2 : dp[j][diff]+1; // get maxLen to i with prev element to be j
                dp[i][diff] = Math.max(dp[i][diff], len);
                ans = Math.max(ans, dp[i][diff]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        LongestArithmeticSubsequence longestArithmeticSubsequence = new LongestArithmeticSubsequence();
        longestArithmeticSubsequence.longestArithSeqLength(new int[]{9,4,7,2,10});
    }
}
