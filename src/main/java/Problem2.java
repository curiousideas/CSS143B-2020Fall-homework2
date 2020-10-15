public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
// {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
        int index = 1; //2
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[index++] = nums[i+1];
            }
        }
        return index;
    }
}
