"""
Given a pattern and a string str, find if str follows the same pattern.
匹配
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
"""
"""
用哈希表来做，建立模式字符串中每个字符和单词字符串每个单词之间的映射，
而且这种映射必须是一对一关系的，不能'a‘和’b'同时对应‘dog'，所以我们
在碰到一个新字符时，首先检查其是否在哈希表hm1中出现，若出现，其映射的单
词若不是此时对应的单词，则返回false。如果没有在哈希表中出现，我们还要查
看哈希表hm2，看新遇到的单词是否已经在hm2中有映射，如果没有，再跟新遇
到的字符建立映射，更新hm1和hm2。即hm1中的映射要和hm2中的完全一致
"""
class Solution:
    def wordPattern(self, pattern, str):
        strs=str.split()
        if len(pattern)!=len(strs):
            return False
        hm1 = {}
        hm2= {}
        pos=0
        for i in pattern:
            if i in hm1:
                if hm1[i]!=strs[pos]:
                    return False
            else:
                if strs[pos] in hm2:
                    return False
                else :
                    hm1[i]=strs[pos]
                    hm2[strs[pos]]=i
            pos+=1
        return True

        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
