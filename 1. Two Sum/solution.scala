object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
        var indexMap = Map[Int, Int]()
        for (i <- nums.indices) {
            val c = target - nums(i)
            if (indexMap.contains(c)) {
                return Array(indexMap(c), i)
            }
            indexMap += (nums(i) -> i)
        }
        return Array()
    }
}