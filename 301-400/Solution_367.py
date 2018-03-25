#Valid Perfect Square
#Given a positive integer num, write a function which returns True if num is a perfect square else False
#判断一个正数是不是一个平方数

class Solution:
    def isPerfectSquare(self, num):
        mid=(int)(num/2)+1
        for i in (range(1,mid+1)):
            tmp = i * i
            if tmp == num:
                return True
            elif tmp > num:
                return False
        return False


        """
        :type num: int
        :rtype: bool
        """
print(list(range(1,10)))