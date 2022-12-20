//Used Javascript as hashmap data structure could easily be created and used in it.

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 * two some single pass hashmap
 */
var twoSum = function(nums, target) {
    var hashMap = {}, counter_part, return_val = [-1, -1];
    for (var i = 0; i <= (nums.length -1); i++) {
        counter_part = target - nums[i];
        if (hashMap[counter_part]) {
            if (hashMap[counter_part].length) {
                return_val = [i, hashMap[counter_part][0]];
            }
        }
        if (hashMap[nums[i]]) {
            hashMap[nums[i]] = hashMap[nums[i]].concat(i);
        } else {
            hashMap[nums[i]] = [i];
        }
    }
    return return_val;
};
