#使用字典
class Solution:
    def containsNearbyDuplicate(self, nums, k):
        mymap={} #格式为数字+索引位置，位置实时更新
        i=0
        for data in nums:
            if data in mymap:
                if abs(mymap[data]-i)<=k:
                    return True
                else:
                    mymap[data]=i #进行位置信息更新
            else:
                mymap[data]=i #将信息录入字典
            i+=1

        return False


        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """