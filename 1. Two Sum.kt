class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val answer = IntArray(2)
        var flag: Boolean
        var first: Int; var second: Int
        for (i in nums.indices) {
            if (i == nums.size-1) break
            first = nums[i];
            flag = false
            for (j in i+1 until nums.size) {
                second = nums[j]
                if (first + second == target) {
                    answer[0] = i
                    answer[1] = j
                    flag = true
                    break
                }
            }
            if (flag) break
        }
        return answer
    }
}
