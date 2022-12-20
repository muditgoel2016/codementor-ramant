//Used Javascript as hashmap data structure could easily be created and used in it.
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 * two sum double pass hashmap
 */
var twoSum = function(nums, target) {
    var hashMap = {}, counter_part, valid_idxs = [];
    for (var i = 0; i <= (nums.length -1); i++) {
        if (hashMap[nums[i]]) {
            hashMap[nums[i]] = hashMap[nums[i]].concat(i);
        } else {
            hashMap[nums[i]] = [i];
        }
    }

    for (var i = 0; i <= (nums.length -1); i++) {
        counter_part = target - nums[i];
        if (hashMap[counter_part]) {
            valid_idxs = hashMap[counter_part].filter(idx => idx != i);
            if (valid_idxs.length) {
            return [i, valid_idxs[0]];
            }
        }
    }
    return [-1,-1];
};
