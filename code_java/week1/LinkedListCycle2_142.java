package week1;

public class LinkedListCycle2_142 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    static class Solution {
        public ListNode detectCycle(ListNode head) {

            if (head == null || head.next == null) {
                return null;
            }

            ListNode slow = head;
            ListNode fast = head;
            ListNode tmp = head;
            while (fast.next != null && fast.next.next != null) {

                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    while (slow != tmp) {
                        tmp = tmp.next;
                        slow = slow.next;
                    }
                    return tmp;
                }

            }
            return null;

        }
    }


}
