
"""
这个是排好序进行计算
O（nlogn）解法
"""
class Solution:
    def thirdMax(nums):
        nums.sort(reverse=True)
        count=0
        ret=nums[0]+1
        if len(nums)<3:
            return nums[0]
        else:
            for data in nums:
                if data<ret:
                    count+=1
                    ret=data
                if count==3:
                    return ret
            return nums[0]



s = Solution
ret=s.thirdMax([3,4,1,2,6])
print(ret)