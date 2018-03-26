#Nth Digit --- 第几位数字
#可以计算范围，然后一次去掉已经计算出来的位数，然后算出，数字。
class Solution:
    def findNthDigit(self, n):
        if n<0:
            return 0
        count=9
        start=1
        length=1
        while n>length*count:
            n-=length*count
            length+=1
            count*=10
            start*=10
        #具体是哪个数字
        start+=(n-1)/length
        print(n)
        return int(str(start)[(n-1)%length])

        """
        :type n: int
        :rtype: int
        """

s1=Solution
print(s1.findNthDigit(s1,3))