/**
 *   Created By : Hassan Shalash
 *   Date  : 30/08/2023
 *   Difficult Problem
 */

class minimumReplacement {
    public static long minimumReplacementProblem(int[] nums) {
        int n = nums.length;
        int last = nums[n - 1];  // Initialize 'last' with the last element
        long ans = 0;  // Initialize the total operations count

        // Traverse the array in reverse order
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] > last) {  // If the current element needs replacement >>shoof arrangement el2wl
                int t = nums[i] / last;  // Calculate how many times the element needs to be divided
                if (nums[i] % last != 0) {
                    t++;  // If there's a remainder, increment 't'
                }
                last = nums[i] / t;  // Update 'last' for the next comparison
                ans += t - 1;  // Add (t - 1) to 'ans' for the number of operations
            } else {
                last = nums[i];  // Update 'last' without replacement
            }
        }
        return ans;  // Return the total number of operations
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