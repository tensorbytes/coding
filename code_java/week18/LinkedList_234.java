package week18;

import com.sun.xml.internal.bind.v2.model.core.NonElement;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/12/19 0019
 */
public class LinkedList_234 {

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public boolean isPalindrome(ListNode head) {

            if (head == null || head.next == null) {
                return true;
            }

            if(head !=null && head.next != null && head.next.next == null){
                return head.val == head.next.val;
            }

            ListNode fast = head, slow = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            if (fast != null) {
                slow = slow.next;
            }
            ListNode mid = slow;
            ListNode tail = revers(mid);

            while (tail != slow) {
                if (tail.val != head.val) {
                    return false;
                } else {
                    tail = tail.next;
                    head = head.next;
                }
            }

            return tail.val == head.val;
        }

        public ListNode revers(ListNode head) {
            ListNode pre = null, cur = head;
            ListNode tmp;
            while (cur != null) {
                tmp = cur.next;
                cur.next = pre;
                pre = cur;
                cur = tmp;
            }
            return pre;
        }
    }


}
