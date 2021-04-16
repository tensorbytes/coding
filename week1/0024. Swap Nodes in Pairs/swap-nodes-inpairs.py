# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        if not head or not head.next :
            return head
        # 头节点 1->2->3->4
        tail = head.next
        # 中间节点,先交换3->4 = 4->3,然后1->4->3
        head.next = self.swapPairs(tail.next)
        # 交换1->2 = 2->1
        tail.next = head
        return tail