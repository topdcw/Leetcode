"""
Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).
"""

class Solution:
    def checkPossibility(self, nums):
        count=0
        i=1
        while i<len(nums):
            if nums[i-1]>nums[i]:
               count+=1
               #针对第一个元素和最后一个元素
               if i==1:
                   nums[i-1]=nums[i]
               elif i==(len(nums)-1):
                   nums[i]=nums[i-1]
                #针对中间的元素
               else:
                   if nums[i-1]>nums[i+1]:
                       nums[i-1]=nums[i]
                   else:
                       nums[i]=nums[i-1]
               if count>1:
                    return False
               i=0
            i+=1
        return True
        """
        :type nums: List[int]
        :rtype: bool
        """