# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def isPalindrome(self, head: ListNode) -> bool:

        if head and head.next is None:
            return True

        if head and head.next and head.next.next is None:
            return head.val == head.next.val

        fast, slow = head, head

        # 找出中间节点,
        # 当节点数为奇数时, 遍历到最后fast刚好是最后一个
        # 当节点数为偶数时，遍历到最后,fast是倒数第二个,fast.next.next为空
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next

        # 无论是奇数还是偶数, mid都取slow, 因为从slow反转之后, 前半段最后一个节点是slow, 后半段最后一个指向也为slow
        # 因此 从头向中间 ，从尾向中间靠拢的时候，终止条件为slow即可
        mid = slow
        # 从中间节点对后半部分进行链表反转
        foot = self.revers(mid)

        # 两边向中间靠拢,比较是否对称
        result = self.check(head, foot, mid)

        # 复原链表
        self.revers(foot)

        return result

    def check(self, a: ListNode, b: ListNode, mid: ListNode):
        while b != mid:
            if a.val != b.val:
                return False
            a = a.next
            b = b.next
        return True

    def revers(self, head: ListNode):
        pre, cur = None, head
        while cur:
            cur.next,pre,cur = pre,cur,cur.next
        return pre


if __name__ == '__main__':
    a = [1,2,2,1]
    pre,cur = ListNode(),None
    head = pre
    for i in a:
        cur = ListNode(i)
        pre.next = cur
        pre = cur

    obj = Solution()
    print(obj.isPalindrome(head.next))
