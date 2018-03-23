#Range Sum Query - Immutable

#使用直方图的思想
class NumArray:

    def __init__(self, nums):
        self.data=nums
        self.sums=[0]*len(nums)
        if len(nums)>0:
            self.sums[0]=nums[0]
        i=1
        while i<len(nums):
            self.sums[i]=self.sums[i-1]+nums[i]
        """
        :type nums: List[int]
        """

    def sumRange(self, i, j):
        return self.sums[j]-self.sums[i]+self.data[i]
        """
        :type i: int
        :type j: int
        :rtype: int
        """

# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(i,j)