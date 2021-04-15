/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
 func detectCycle(head *ListNode) *ListNode {
    slow, fast := head, head
    for slow != nil && fast != nil && fast.Next != nil{
        slow = slow.Next
        fast = fast.Next.Next
        if slow == fast{
            dection := head
            for dection != slow{
                dection = dection.Next
                slow = slow.Next
            }
            return dection
        }
    }
    return nil
    
}