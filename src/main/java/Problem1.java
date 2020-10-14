public class Problem1 {

    /*
    I have 3 pointers. Start indicates where the 0's should be, an index pointer that moves to each index, and
    a end pointer indicating where the 2's go. If nums[index] is 0 it is sent to nums[start]. If nums[index] is 1 its skipped.
    If nums[index] is 2 its sent to nums[end].
     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }

        int start = 0; // 2
        int end = nums.length - 1; // 5
        int index = 0; // 4
        // {1,1,0,1,2,0,1,2,1},
        while (index <= end && start < end) {
            if (nums[index] == 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            } else if (nums[index] == 2) {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            } else {
                index++;
            }
        }
    }
}


