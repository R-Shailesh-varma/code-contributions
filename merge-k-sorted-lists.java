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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        return divideAndConquer(lists, 0, lists.length-1);
    }public static ListNode divideAndConquer(ListNode[] lists, int low, int high){
        if(low >= high){
            return lists[low];
        }int mid = (low + high)/2;
        ListNode left = divideAndConquer(lists, low, mid);
        ListNode right = divideAndConquer(lists, mid+1, high);
        ListNode head = mergeLists(left, right);
        return head;
    }public static ListNode mergeLists(ListNode left, ListNode right){
        if (left == null) return right;
        if (right == null) return left;

        ListNode head;
        if (left.val < right.val) {
            head = left;
            left = left.next;
        } else {
            head = right;
            right = right.next;
        }
        ListNode temp = head;

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