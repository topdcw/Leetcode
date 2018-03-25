#Reverse Vowels of a String
"""
Example 1:
Given s = "hello", return "holle".

Example 2:
Given s = "leetcode", return "leotcede".
"""

class Solution:
    def reverseVowels(self, s):
        chs=list(s)
        vowels=[]
        i=0
        while i<len(chs):
            if(chs[i]=='a' or chs[i]=='e'or chs[i]=='i'or chs[i]=='o'or chs[i]=='u'or chs[i]=='A' or chs[i]=='E'or chs[i]=='I'or chs[i]=='O'or chs[i]=='U'):
                vowels.append(chs[i])
                chs[i]=''
                i+=1
        j=len(vowels)-1
        k=0
        while k<len(chs):
            if chs[k]=='':
                chs[k]=vowels[j]
                j-=1
            k+=1
        return ''.join(chs)

        """
        :type s: str
        :rtype: str
        """
range(10)
print(range(10))