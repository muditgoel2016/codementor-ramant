//Used Javascript
function simpleSearch(nums, target) {
    for (var idx=0; idx <= (nums.length - 1); idx++) {
        if (nums[idx] == target) {
            return idx;
        }
    }
    return -1;
}
