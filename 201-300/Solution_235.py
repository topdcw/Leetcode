
#Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None
#默认树上两点不同
"""
注意审题，题目是二分搜索树
对于二叉搜索树，公共祖先的值一定大于等于较小的节点，小于等于较大的节点。
换言之，在遍历树的时候，如果当前结点大于两个节点，则结果在当前结点的左子树里，如果当前结点小于两个节点，则结果在当前节点的右子树里。
"""
class Solution:
    def lowestCommonAncestor(self, root, p, q):
        if root==None:
            return None
        elif root.val>p.val and root.val>q.val:
            return self.lowestCommonAncestor(root.left,p,q)
        elif root.val<p.val and root.val<q.val:
            return self.lowestCommonAncestor(root.right,p,q)
        else:
            return root;

        """
        :type root: TreeNode
        :type p: TreeNode
        :type q: TreeNode
        :rtype: TreeNode
        """
