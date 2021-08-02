# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: ListNode, k: int) -> ListNode:

        if k==1 :
            return head

        pre,pre.next  = self, head
        end = pre
        while end.next:
            # 根据K值找出子链表的尾节点
            for i in range(k):
                if end.next:
                    end = end.next
                else:
                    return self.next

            # 记录子链表的尾节点的下一个节点,然后置空,划分出子链表
            tmp_next = end.next
            end.next = None
            start = pre.next

            # 逆转子链表
            self.reversPart(start)

            # 原来的start已经变成尾节点, 需要将尾节点的next指针指向下一个
            start.next = tmp_next
            # 原来的end作为上一个子链表的下一个节点
            pre.next = end

            # 重新设置下标, 准备划分下一个子链表
            pre = start
            end = pre

        return self.next

    def reversPart(self,head: ListNode) -> ListNode:
        pre,cur = None,head
        while cur:
            tmp = cur.next
            cur.next = pre
            pre = cur
            cur = tmp
        return pre