class Solution { //Binary Search, recursive
    public int search(int[] nums, int target) {
        int left_idx = 0;
        int right_idx = nums.length - 1;
        int found_idx = -1;
        if ((target < nums[left_idx]) || (target > nums[right_idx])) {
            return found_idx;
        }

        found_idx = Solution.searchRecursive(nums, target, left_idx, right_idx);
        return found_idx;
    }

    public static int searchRecursive(int[] nums, int target, int left_idx, int right_idx) {
            int mid_idx = left_idx + (right_idx - left_idx)/2;
                mid_idx = (int)Math.floor(mid_idx);
            int found_idx = -1;

            if (target < nums[mid_idx]) {
                right_idx = mid_idx - 1;
                found_idx = Solution.searchRecursive(nums, target, left_idx, right_idx);
            }
            if (target == nums[mid_idx]) {
                found_idx = mid_idx;
            }
            if (target > nums[mid_idx]) {
                left_idx = mid_idx + 1;
                found_idx = Solution.searchRecursive(nums, target, left_idx, right_idx);
            }
            return found_idx;
    }
}
