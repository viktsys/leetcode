class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        result = []
        diff_map = {}
        for idx, val in enumerate(nums):
            diff = target - val
            if diff in diff_map:
                result.append(idx)
                result.append(diff_map[diff])
                break
            else:
                diff_map[val] = idx
        return result
