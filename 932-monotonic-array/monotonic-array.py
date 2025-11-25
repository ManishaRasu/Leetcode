class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        asc=desc=True
        n=len(nums)
        for i in range(n-1):
            if nums[i]>nums[i+1]:
                asc=False
            elif nums[i]<nums[i+1]:
                desc=False
        if asc==False and desc==False:
            return False
        else:
            return True
        