package week17;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/12/12 0012
 */
public class LinkedList_160 {


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    /***
     * 该题的关键在于  步数一样的情况下，
     * 如下面的做法将会得到以下式子
     *
     * a + b + c =  b + c + a
     * 参考官网解析
     *
     *
     */

    static class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            if(headA==null || headB == null){
                return null;
            }
            ListNode pa=headA,pb=headB;
            while(pa!=pb){
                pa = pa == null? headB:pa.next;
                pb = pb == null? headA:pb.next;
            }
            return pa;
        }
    }


}
