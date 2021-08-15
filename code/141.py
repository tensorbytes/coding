# Definition for singly-linked list.
class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None


class Solution:
    def hasCycle(self, head: ListNode) -> bool:

        if head is None or head.next is None:
            return False

        fast, slow = head, head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                return True

        return False
