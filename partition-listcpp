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
    ListNode* partition(ListNode* head, int x) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }
        ListNode* dum1 = new ListNode(0);
        ListNode* dum2 = new ListNode(0);
        ListNode *less = dum1, *more = dum2;

        while(head!= nullptr){
            if(head->val >= x){
                more->next = head;
                more = more->next;
            }else{
                less->next = head;
                less = less->next;
            }head = head->next;
        }more->next = nullptr;
        less->next = dum2->next;
        return dum1->next;
    }
};
