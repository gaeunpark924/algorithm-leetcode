class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val strX = x.toString()
        var idx1 = 0; var idx2 = strX.length-1
        while (idx1 <= idx2) {
            if (strX[idx1] == strX[idx2]) {
                idx1++
                idx2--
                continue
            }
            return false
        }
        return true
    }
}
