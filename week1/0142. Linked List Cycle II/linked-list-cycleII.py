# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None
# 快慢指针变形
class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow, fast = head, head
        while slow and fast and fast.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                # 查找交叉点
                dection = head
                while dection != slow:
                    slow = slow.next
                    dection = dection.next
                return dection
        return None
