package week16;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 11/26/2021
 */


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

public class Merge_21 {

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            if (list1 == null) {
                return list2;
            }

            if (list2 == null) {
                return list1;
            }

            ListNode pre = new ListNode();
            ListNode cur = pre;

            while (true) {

                if (list1 == null) {
                    cur.next = list2;
                    return pre.next;
                }

                if (list2 == null) {
                    cur.next = list1;
                    return pre.next;
                }

                if (list1.val < list2.val) {
                    cur.next = list1;
                    cur = list1;
                    list1 = list1.next;
                } else {
                    cur.next = list2;
                    cur = list2;
                    list2 = list2.next;
                }
            }
        }
    }
}
