class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None
#判断链表是回文链表。do it in O(n) time and O(1) space
"""
1. 获取链表的中点,使用龟兔算法的方法，两个指针，一个遍历速度是另外一个的两倍，找到中点
2. 然后反转链表的后半部分
3. 对比链表的前后两个部分是否一样
4. 最后将原链表的后半部分反转恢复原来的链表(不过在该题中，未做复原）
"""
class Solution:
    def isPalindrome(self, head):
        if head ==None:
            return True
        first=head
        second=head
        while first!=None and second!=None :
            #先判断second是否能继续下去，如果不能，说明first是链表中点
            if second.next!=None:
                if second.next.next!=None:
                    second=second.next.next
                    first=first.next
                else:
                    break
            else:
                break
        # 翻转first后的所有节点
        tmp=first.next
        head2 = ListNode(0)
        while tmp!=None:
            nowT=tmp #被操作的节点
            tmp = tmp.next
            nowT.next=head2.next
            head2.next=nowT
        #回文比对
        head2=head2.next
        while head!=None and head2!=None:
            if head.val!=head2.val:
                return False
            else:
                head=head.next
                head2=head2.next
        return True


