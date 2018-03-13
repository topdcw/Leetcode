#Binary Tree Paths

# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

#思路就是递归遍历这棵树

class Solution:
    def binaryTreePaths(self, root):
        strs=[]
        List=[]
        if root==None:
            return List

        self.searchTree(root,strs,List)
        return List


    def searchTree(self,root,strs,List):
        if root.left==None and root.right==None:
            strs.append(str(root.val))
            List.append(''.join(strs))
            del strs[-1]
        if root.left!=None:
            strs.append(str(root.val)+'->')
            self.searchTree(root.left,strs,List)
            del strs[-1]
        if root.right!=None:
            strs.append(str(root.val) + '->')
            self.searchTree(root.right, strs, List)
            del strs[-1]



        """
        :type root: TreeNode
        :rtype: List[str]
        """
