#Power of Four 判断一个32位的整数是不是4的幂

class Solution:
    def isPowerOfFour(self, num):
        #一直除以4
        if num<=0:
            return False
        while num%4==0 and num!=1:
            num=num/4
        if num==1 or num==-1:
            return True
        else:
            return False
        """
        :type num: int
        :rtype: bool
        """
