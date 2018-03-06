# Definition for singly-linked list.
class ListNode:
     def __init__(self, x):
         self.val = x
         self.next = None

class Solution:
    def removeElements(self, head, val):
        #人为增加一个头结点
        first=ListNode
        first.next=head
        pre=first
        data=head
        while data!=None:
            if data.val==val:
                pre.next=data.next
                data=pre.next
            else:
                pre=pre.next
                data=data.next
        return first.next;
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
