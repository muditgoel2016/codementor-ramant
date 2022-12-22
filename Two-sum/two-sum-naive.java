class Solution { //Two sum, naive approach
    public int[] twoSum(int[] nums, int target) {
        if ((nums == null) || (target || null)) {
            return new int[] {-1,-1};
        }
        for (int i = 0; i <= nums.length -1; i++) {
            if (nums[i] == null) {
                return new int[] {-1,-1};
            }
            int counter_part = target - nums[i];
            for (int j = i+1; j <= nums.length - 1; j++) {
                if (nums[j] == counter_part) {
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
