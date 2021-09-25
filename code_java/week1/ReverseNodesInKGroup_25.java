package week1;

/**
 * @Description
 * @Author weiyu
 * @Version V1.0.0
 * @Since 1.0
 * @Date 9/6/2021
 */
public class ReverseNodesInKGroup_25 {

    static class ListNode {
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
        public ListNode reverseKGroup(ListNode head, int k) {
            ListNode first = new ListNode(-1);
            first.next = head;
            ListNode prev = first,end = first;
            ListNode next, start;
            while (end.next!=null) {
                // 凑齐K个节点
                start = end.next;
                for(int i=0;i<k;i++){
                    end = end.next;
                    if(end==null){  //等于空说明不够 K个节点了,直接返回
                        return first.next;
                    }
                }
                //记录最后一个节点的下一个节点,然后砍断链表
                next = end.next;
                end.next = null;
                //对链表进行逆转
                reversK(start);
                //拼接逆转后的链表, end已经转变为起点了,start为结束点了
                prev.next = end;  //此处要将头接起来
                start.next = next; //此处将尾接回来
                prev = start; //此处更新上一节点的值,为下一轮逆转做准备了
                end = start;
            }
            return first.next;
        }

        public ListNode reversK(ListNode head) {
            ListNode prev = null,cur = head;
            while(cur!=null){
                ListNode tmp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = tmp;
            }
            return prev;

        }
    }


    public static void main(String[] args) {

        ListNode prev = new ListNode(-1);
        ListNode tmp = prev;
        for (int i = 1; i < 8; i++) {
            ListNode a = new ListNode(i);
            tmp.next = a;
            tmp = a;
        }
        Solution s = new Solution();
        tmp = s.reverseKGroup(prev.next,3);
        while (tmp != null) {
            System.out.println(tmp.val + " ,");
            tmp = tmp.next;
        }

    }

}
