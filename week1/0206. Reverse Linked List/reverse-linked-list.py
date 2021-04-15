# coding:utf-8
# 题目url: https://leetcode-cn.com/problems/reverse-linked-list/comments/
# 双指针方法

class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        cur, prev = head, None
        while cur:
            # 记录当前节点的下个节点
            tmp = cur.next
            # 当前节点指向prev
            cur.next = prev
            # pre和cur节点都前进一位
            prev = cur
            cur = tmp
        return prev

# 递归方法
class Solution:
    def reverseList(self, head: ListNode) -> ListNode:
        # 终止条件
        if head == None or head.next == None:
            return head
        newhead = self.reverseList(head.next)
        # 4.next.next = 4 -> 5.next =4
        head.next.next = head
        head.next = None
        return newhead
