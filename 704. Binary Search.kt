class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0; var right = nums.size-1
        var mid: Int
        while (left <= right) {
            mid = (left + right) / 2
            if (target < nums[mid])
                right = mid-1
            else if (target > nums[mid])
                left = mid+1
            else if (target == nums[mid])
                return mid
        }
        return -1
    }
}
