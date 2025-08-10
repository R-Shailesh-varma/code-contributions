/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return helper(head, null);
    }public static ListNode helper(ListNode head, ListNode tail){
        if(head == tail){
            return (head != null) ? new ListNode(head.val) : null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != tail && fast.next != tail){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode left = helper(head, slow);
        ListNode right = helper(slow.next, tail);
        return merge(left, right);
    }public static ListNode merge(ListNode left, ListNode right){
        if(left == null) return right;
        if(right == null) return left;
        ListNode head = null;
        if(left.val < right.val){
            head = left;
            left = left.next;
        }else{
            head = right;
            right = right.next;   
        }ListNode temp = head;
        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                left = left.next;
                temp = temp.next;
            }else{
                temp.next = right;
                right = right.next;
                temp = temp.next;
            }
        }while(left != null){
            temp.next = left;
            left = left.next;
            temp = temp.next;
        }while(right != null){
            temp.next = right;
            right = right.next;
            temp = temp.next;
        }return head;
    }
}