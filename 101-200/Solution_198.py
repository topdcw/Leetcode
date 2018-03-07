#使用动态规划

class Solution:
    def rob(self, nums):
        lens=len(nums)
        data=[]
        if lens>0:
            data.append(nums[0])
            if lens==1:
                return data[0]
            else:
                if nums[1]>nums[0]:
                    data.append(nums[1])
                else:
                    data.append(nums[0])
        else:
            return 0
        #从第三位开始计算
        count=3
        while count<=lens:
            tmp1=nums[count-1]+data[count-3]
            tmp2=data[count-2]
            if tmp1>tmp2:
                data.append(tmp1)
            else:
                data.append(tmp2)
            count+=1
        #寻找data中的最大值
        return max(data)

