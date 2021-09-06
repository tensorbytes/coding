package week1;

import java.util.ArrayList;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/6/2021
 */
public class SwapNodesInPairs_24 {
    static  class ListNode {
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

    static class Solution {
        public ListNode swapPairs(ListNode head) {

            // 这里能够用-1是因为 题目规定 ListNode的值范围 为 0<= x <= 50000
            ListNode prev = new ListNode(-1);
            ListNode rs = prev;
            prev.next = head;
            ListNode a,b,tmp;
            while(prev.next!=null && prev.next.next !=null){
                a = prev.next;
                b = prev.next.next;
                tmp = b.next;
                prev.next = b;
                b.next = a;
                a.next = tmp;
                prev = a;
            }
            return rs.next;
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        ListNode prev = new ListNode(-1);
        ListNode tmp = prev;
        for(int i =1;i<5;i++){
            ListNode a = new ListNode(i);
            tmp.next = a;
            tmp = a;
        }
        s.swapPairs(prev.next);
    }
}
