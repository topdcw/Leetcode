
"""
O(n)解法
"""
import sys
class Solution:
    def thirdMax(self,nums):
        first=-sys.maxsize-1
        second=-sys.maxsize-1
        third=-sys.maxsize-1
        print(first)
        for data in nums:
            if data>first:
                third = second
                second=first
                first=data
            elif data>second and data<first:
                third=second
                second=data
            elif data>third and data<second:
                third=data

        return first if third==(-sys.maxsize-1) else third


s=Solution
print(s.thirdMax(s,[1,2]))