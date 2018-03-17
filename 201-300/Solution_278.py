# The isBadVersion API is already defined for you.
# @param version, an integer
# @return a bool
# def isBadVersion(version):

"""
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad.
Implement a function to find the first bad version. You should minimize the number of calls to the API.
使用二分查找
"""

class Solution(object):
    def firstBadVersion(self, n):
        head=1
        end=n
        while head<end:
            mid=(head+end)/2
            if isBadVersion(mid)==True:
                end=mid
            else:
                head=mid+1
        #结束循环后，head和end均指向第一个版本错误的点
        return head
        """
        :type n: int
        :rtype: int
        """