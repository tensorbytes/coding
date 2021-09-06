# coding=utf-8
# ----------------
# author: weiyu
# create_time : 9/6/2021
# description :
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        fast, slow = head, head
        while fast and fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
            if slow == fast:
                tmp = head
                index = 0
                while slow != tmp:
                    slow = slow.next
                    tmp = tmp.next
                    index += 1
                return index
        return -1
