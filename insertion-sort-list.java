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
    public ListNode insertionSortList(ListNode head) {
        if(head == null) return head;
        ListNode tail = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val < tail.val){
                tail.next = cur.next;
                head = insert(head, cur);
                cur = tail.next;
            }else{
                tail = cur;
                cur = cur.next;
            }
        }
        return head;
    }

    private ListNode insert(ListNode head, ListNode cur){
        if(cur.val <= head.val){
            cur.next = head;
            head = cur;
        }else{
            ListNode temp = head;
            ListNode prev = null;
            while(temp.val < cur.val){
                prev = temp;
                temp = temp.next;
            }
            prev.next = cur;
            cur.next = temp;
        }return head;
    }
}