#Guess Number Higher or Lower
# The guess API is already defined for you.
# @param num, your guess
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num):
#从1到n查找到需求的数字，二分查找

class Solution():
    def guessNumber(self, n):
        start=1
        end=n
        while start<end:
            mid=(start+end)/2
            ans=guess(mid)
            if ans==-1:
                start=mid+1
            elif ans==1:
                end=mid-1
            else:
                return mid

        """
        :type n: int
        :rtype: int
        """