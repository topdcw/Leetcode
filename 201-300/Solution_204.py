
#埃拉托斯特尼筛法
#要得到自然数n以内的全部素数，必须把不大于根号n的所有素数的倍数剔除，剩下的就是素数
"""
给出要筛数值的范围n，找出以内的素数。
先用2去筛，即把2留下，把2的倍数剔除掉；
再用下一个质数，也就是3筛，把3留下，把3的倍数剔除掉；
接下去用下一个质数5筛，把5留下，把5的倍数剔除掉；不断重复下去......。
"""
#求n以内的素数个数
class Solution:
    def countPrimes(self, n):
        if n==0 or n==1 or n==2:
            return 0
        else:
            f=[0,0,1]
            for i in range(3,n):
                if i%2==0:
                    f.append(0)
                else:
                    f.append(1)
            #从3开始
            i=3
            while i*i<=n-1:
                if f[i]==1:
                    j=2
                    while j*i<=n-1:
                        f[j*i]=0
                        j+=1
                    i+=1
                else:
                    i+=1
            count=0
            for i in f:
                if i==1:
                    count+=1
            return count


s=Solution()
print(s.countPrimes(1000000))

