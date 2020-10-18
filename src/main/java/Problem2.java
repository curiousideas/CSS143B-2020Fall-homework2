public class Problem2 {

    /*
    I have 2 pointers. index indicates where the next non duplicate number should go.
    The second pointer is the at [i]. The function skips numbers that are the same and
    switches number at [i+1] with index.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}
