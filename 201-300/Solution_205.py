#Isomorphic Strings
#Given two strings s and t, determine if they are isomorphic.
"""
Given "egg", "add", return true.
Given "foo", "bar", return false.
Given "paper", "title", return true.
"""
#使用映射解决问题，用数组做映射。
class Solution:
    def isIsomorphic(self, s, t):
        if len(s)!=len(t):
            return False
        mapS=[0]*128
        mapT=[0]*128
        n=len(s)
        i=0
        while i<n:
            if mapS[ord(s[i])]!=mapT[ord(t[i])]:
                return False
            else:
                mapS[ord(s[i])]=mapT[ord(t[i])]=i+1
            i+=1
        return True

        """
        :type s: str
        :type t: str
        :rtype: bool
        """
