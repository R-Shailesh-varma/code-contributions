/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        ListNode *prev = dummy;
        ListNode *temp = head, *slow = head;
        while(prev->next!=nullptr && prev->next->next != nullptr){
            ListNode* first = prev->next;
            ListNode* second = prev->next->next;
            first->next = second->next;
            second->next = first;
            prev->next = second;
            prev = first;
        }return dummy->next;
    }
};