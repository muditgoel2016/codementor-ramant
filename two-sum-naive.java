class Solution { //Two sum, naive approach
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <= nums.length -1; i++) {
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
