# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next


class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        pre = ListNode()
        cur = pre
        # 随便挑一个,如果两个都是空的情况有个默认值
        cur.next = l1
        while True:
            if not l1 and not l2:
                break

            if not l1:
                cur.next = l2
                l2 = l2.next
                cur = cur.next
                continue

            if not l2:
                cur.next = l1
                l1 = l1.next
                cur = cur.next
                continue

            if l1.val <= l2.val:
                cur.next = l1
                l1 = l1.next
            else:
                cur.next = l2
                l2 = l2.next

            cur = cur.next

        return pre.next