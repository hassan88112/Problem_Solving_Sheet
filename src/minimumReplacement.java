/**
 *   Created By : Hassan Shalash
 *   Date  : 30/08/2023
 *   Difficult Problem
 */

class minimumReplacement {
    public static long minimumReplacementProblem(int[] nums) {
        long ans = 0;

        int max = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; --i) {
            final int ops = (nums[i] - 1) / max;
            ans += ops;
            max = nums[i] / (ops + 1);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums1 = {3, 9, 3};
        int minOps1 = (int) minimumReplacementProblem(nums1);
        System.out.println( minOps1);

        int[] nums2 = {1, 2, 3, 4, 5};
        int minOps2 =(int) minimumReplacementProblem(nums2);
        System.out.println(minOps2);
    }

}